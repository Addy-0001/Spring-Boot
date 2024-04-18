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

// Task:
// Create Tables : Ground, User, Book.
// Book: BookTime, BookDate, BookStatus,
// User: Username, age, email
//

@Entity
@Table(name = "Ground")
class Ground{
    @Id
    @Column(name = "ground_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "Ground", length = 256)
    private String ground;

    @Column(name = "User", length = 256)
    private String User;

    @Column(name = "Book", length = 256)
    private String Book;

}

@Entity
@Table(name = "Book")
class Book{
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
}

@Entity
@Table(name = "User", uniqueConstraints = { @UniqueConstraint(name = "unique_username", columnNames = "username")})
class User{
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "username", length = 256)
    private String username;

    @Column(name = "age", length = 256)
    private String age;

    @Column(name = "email", length = 256)
    private String email;

}