package com.userAuth.userAuthDB.controller;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "Welcome to HOME Page";
    }

    @GetMapping("/username")
    public String currentUsername(Authentication authentication){
        String name = authentication.getName();
        System.out.println(name);
        return name;
    }
    @GetMapping("/login")
    public String login(){
        return "Welcome to LOGIN Page";
    }

    @GetMapping("/signup")
    public String signup(){
        return "Welcome to SIGNUP Page";
    }

}
