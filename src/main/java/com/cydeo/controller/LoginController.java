package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = {"/login","/"}) //local host 8080/ or local host:8080/login are the same
    public String login(){

        return "login";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}