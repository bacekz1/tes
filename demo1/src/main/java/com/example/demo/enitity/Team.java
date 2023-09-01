package com.example.demo.enitity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Part> parts;
}
