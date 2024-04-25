package com.example.firstspring.service.impl;

import com.example.firstspring.entity.Ground;
import com.example.firstspring.pojo.FutsalPojo;
import com.example.firstspring.repository.GroundRepository;
import com.example.firstspring.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FutsalServiceImpl implements FutsalService {

    private final GroundRepository groundRepository;

    @Override
    public void save(FutsalPojo futsalPojo) {
        Ground ground = new Ground();
        ground.setId(futsalPojo.getId());
        ground.setGround(futsalPojo.getGroundName());
        groundRepository.save(ground);
    }
}
