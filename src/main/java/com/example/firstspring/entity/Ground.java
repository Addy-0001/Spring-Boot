package com.example.firstspring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ground")
public class Ground{
    @Id
    @Column(name = "ground_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "ground", length = 256)
    private String ground;
}
