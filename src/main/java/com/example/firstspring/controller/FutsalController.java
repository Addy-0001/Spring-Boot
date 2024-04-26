package com.example.firstspring.controller;

import com.example.firstspring.entity.Ground;
import com.example.firstspring.pojo.FutsalPojo;
import com.example.firstspring.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/futsal")
@RequiredArgsConstructor
public class FutsalController {

    private final FutsalService futsalService;

    @GetMapping("/list")
    public List<Ground> findAll(){
        return this.futsalService.findAll();
    }

    @PostMapping
    public void save(@RequestBody FutsalPojo futsalPojo) {
        this.futsalService.save(futsalPojo);
    }
}
