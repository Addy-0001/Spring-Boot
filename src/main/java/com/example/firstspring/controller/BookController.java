package com.example.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BookController {
    @GetMapping("/book/list")
    public String list() {

    }
}
