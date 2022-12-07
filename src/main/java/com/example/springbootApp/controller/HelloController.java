package com.example.springbootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHi() {
        return "Hello world";
    }

    @GetMapping("/{name}")
    public String sayHiToSomeOne(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/date")
    public String returnDate() {
        LocalDate date = LocalDate.now();
        return date.toString();
    }
}
