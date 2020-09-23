package com.example.demo;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class taskController {


    @GetMapping("/greeting")
    public task greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new task("random name");
    }
}