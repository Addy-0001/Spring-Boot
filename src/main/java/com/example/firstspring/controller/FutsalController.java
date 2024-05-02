package com.example.firstspring.controller;

import com.example.firstspring.entity.Ground;
import com.example.firstspring.pojo.FutsalPojo;
import com.example.firstspring.service.FutsalService;


import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/futsal")
@RequiredArgsConstructor
public class FutsalController {

    private final FutsalService futsalService;

    @GetMapping("/list")
    public GlobalAPIResponse <List<Ground>> findAll(){
        GlobalAPIResponse<List<Ground>> globalAPIResponse = new GlobalAPIResponse(<List<Ground>>);
        globalAPIResponse.setStatus(200);
        globalAPIResponse.setData(futsalService.findAll());
        globalAPIResponse.saveData(FutsalPojo);
        return globalAPIResponse;
    }

    @PostMapping("/create")
    public void save(@RequestBody FutsalPojo futsalPojo) {
        this.futsalService.save(futsalPojo);
    }

    @PutMapping("/update")
    public void futsalUpdate(@RequestBody FutsalPojo futsalPojo){
        futsalService.save(futsalPojo);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        this.futsalService.deleteByID(id);
    }

    @GetMapping("/get/{id}")
    public Optional<Ground> findbyID(@PathVariable Integer id){
        return this.futsalService.findById(id);
    }
}
