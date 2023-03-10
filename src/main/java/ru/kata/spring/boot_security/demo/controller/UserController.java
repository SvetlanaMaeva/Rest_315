package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping
@Controller
public class UserController {

    @GetMapping("/")
    public String helloPage() {
        return "redirect:/login";
    }

    @GetMapping("/home")
    public String homePage(){
        return "homepage";
    }

    @GetMapping("/admin/user")
    public String printWelcome() {
        return "index";
    }

}
