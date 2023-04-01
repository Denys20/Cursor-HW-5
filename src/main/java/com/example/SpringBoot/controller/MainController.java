package com.example.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/home")
    public String home(Model page,
                       @RequestParam(name="temperature", required = false) Integer temperature,
                       @RequestParam(name="color", required = false) String color) {
        page.addAttribute("temperature", temperature);
        page.addAttribute("color", color);
        return "home";
    }

}
