package com.example.firstspring.service;

import com.example.firstspring.entity.Ground;
import com.example.firstspring.pojo.FutsalPojo;

import java.util.List;

public interface FutsalService {

    void save(FutsalPojo futsalPojo);

    public List<Ground> findAll();

    public void deleteByID(Integer id);
}
