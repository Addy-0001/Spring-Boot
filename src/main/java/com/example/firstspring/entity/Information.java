package com.example.firstspring.entity;
import jakarta.persistence.*;

@Entity
@Table(name="information", uniqueConstraints = { @UniqueConstraint(name = "unique_title", columnNames = "title")})
public class Information {
    @Id
    private Integer Id;

    @Column(name = "title", length = 1000)
    private String title;
}

