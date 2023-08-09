package com.example.test;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@Controller
public class getTest {
    @Autowired
    private DataStorage DataStorage;

    @PostMapping("/test")
    public String test(@RequestBody data data) {
        DataStorage.addData(data);
        System.out.println(DataStorage.getList());
        return "result";
    }
}


