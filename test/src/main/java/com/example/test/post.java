package com.example.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class post {
    @PostMapping("/req")
    public String test() {
        System.out.println("1");
//        System.out.println(input);
        return "test";
    }
}
