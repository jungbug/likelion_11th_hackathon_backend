package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class getTest {
    ArrayList<String> list = new ArrayList<String>();
    @PostMapping("/test")
    public String test(@RequestParam("input") String input) {
        list.add(input);
        System.out.println(list);
        return "result";

    }
}