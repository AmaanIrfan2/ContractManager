package com.contractmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControl {
    @RequestMapping("/home")
    public String home() {
        System.out.println("Home page handler");
        return "home";
    }
}