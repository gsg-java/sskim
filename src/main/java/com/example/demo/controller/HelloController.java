package com.example.demo.controller;

import com.example.demo.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("portfolios", portfolioService.findAll());
        return "index";
    }
}
