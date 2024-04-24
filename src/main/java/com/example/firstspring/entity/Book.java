package com.example.firstspring.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "Book")
public class Book{
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Id;

    @Column(name = "BookDate", length = 256)
    private String BookDate;

    @Column(name = "BookTime", length = 256)
    private String BookTime;

    @Column(name = "BookStatus", length = 256)
    private String BookStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ground_id", referencedColumnName = "ground_id",
            foreignKey = @ForeignKey(name = "fk_ground_ground_id"))
    private Ground ground;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id",
            foreignKey = @ForeignKey(name = "fk_user_user_id"))
    private User user;
}