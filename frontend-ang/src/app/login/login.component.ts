import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {AuthService} from "../services/auth.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit{
  formLogin!:FormGroup;
  constructor(private fb:FormBuilder,private authService:AuthService) {
  }

  ngOnInit():void{
    this.formLogin=this.fb.group({
    username:this.fb.control(""),
      password:this.fb.control("")
    })
  }

  handleLogin() {
    let username=this.formLogin.value.username;
    let password=this.formLogin.value.password;
    this.authService.login(username,password).subscribe({
      next:data=>{
        this.authService.loadProfile(data);
      },

      error:err=>{
        console.log(err);
      }
    });
  }
}
