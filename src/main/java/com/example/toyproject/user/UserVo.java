package com.example.toyproject.user;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 45, nullable = false)
    private String age;

    @Column(length = 45, nullable = false)
    private String hobby;

    @Column(length = 45, nullable = false)
    private String job;

    @Column(length = 45, nullable = false)
    private String address;

    @Column(length = 45, nullable = false)
    private String adddate;


}
