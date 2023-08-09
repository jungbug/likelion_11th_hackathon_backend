package com.example.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class post {
    private DataStorage dataStorage;

    public post(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    @RequestMapping("/test/test")
    public ArrayList<data> test() {
        return dataStorage.getList();
    }
}
