package com.example.firstspring.service.impl;

import com.example.firstspring.entity.Ground;
import com.example.firstspring.pojo.FutsalPojo;
import com.example.firstspring.repository.GroundRepository;
import com.example.firstspring.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FutsalServiceImpl implements FutsalService {

    private final GroundRepository groundRepository;

    @Override
    public List<Ground> findAll() {
        return groundRepository.findAll();
    }

    @Override
    public void deleteByID(Integer id) {
        groundRepository.deleteById(id);
    }

    @Override
    public void save(FutsalPojo futsalPojo) {
        Ground ground = new Ground();
        ground.setId(futsalPojo.getId());
        ground.setGround(futsalPojo.getGroundName());
        groundRepository.save(ground);
    }


}
