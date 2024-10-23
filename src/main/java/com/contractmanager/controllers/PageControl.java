package com.contractmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControl {
    @RequestMapping("/home")
    public String home() {
        System.out.println("Home page handler");
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about page");
        return "about";
    }

    @RequestMapping("/services")
    public String services(){
        System.out.println("This is the services page");
        return "services";
    }

    @RequestMapping("/base")
    public String base(){
        System.out.println("A base page");
        return "base";
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("A login page");
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(){
        System.out.println("A signup page");
        return "signup";
    }
}

