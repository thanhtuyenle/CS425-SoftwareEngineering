package edu.mum.cs.cs425.finalproject.carmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/ecarmanagement"})
    public String index() {
        return "public/home/index";
    }

    @GetMapping(value = {"/ecarmanagement/home"})
    public String home() {
        return "public/home/home";
    }

    @PostMapping(value = {"/ecarmanagement/car/search"})
    public String search() {
        return "public/car/search";
    }

    @GetMapping(value = {"/ecarmanagement/login"})
    public String login() {
        return "public/home/login";
    }

    @GetMapping(value = {"/ecarmanagement/about"})
    public String about() {
        return "public/home/about";
    }

    @GetMapping(value = {"/ecarmanagement/public/virtualtour"})
    public String virtualtour() {
        return "public/home/virtualtour";
    }
}
