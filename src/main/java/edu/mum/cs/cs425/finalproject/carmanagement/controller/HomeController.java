package edu.mum.cs.cs425.finalproject.carmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/carmanagement", "/carmanagement/home"})
    public String home() {
        return "home/index";
    }
}
