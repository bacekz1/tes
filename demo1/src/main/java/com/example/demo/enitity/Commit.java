package com.example.demo.enitity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Commit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commitId;

    private String name;

    @ManyToMany(mappedBy = "commits")
    private List<Part> parts;
    // ... getters, setters, etc...
}
