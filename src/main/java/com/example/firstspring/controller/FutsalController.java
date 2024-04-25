package com.example.firstspring.controller;

import com.example.firstspring.pojo.FutsalPojo;
import com.example.firstspring.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/futsal")
@RequiredArgsConstructor
public class FutsalController {

    private final FutsalService futsalService;

    @PostMapping
    public void save(@RequestBody FutsalPojo futsalPojo) {
        this.futsalService.save(futsalPojo);
    }
}
