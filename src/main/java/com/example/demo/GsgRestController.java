package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GsgRestController {

    @GetMapping("/test")
    public String RestTest() {
        return "Hahaha";
    }

    @GetMapping("/rest")
    public List<String> ListTest() {

        List<String> list = Arrays.asList("김성섭", "김성섭2", "김성섭3", "김성섭4");

        return list;
    }
}
