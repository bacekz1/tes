package com.example.demo.enitity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partId;

    private String partName;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Team team;

    @ManyToMany
    @JoinTable(
            name = "PartManufacturer",
            joinColumns = @JoinColumn(name = "part_id"),
            inverseJoinColumns = @JoinColumn(name = "manufacturer_id")
    )
    private List<Commit> commits;
    // ... getters, setters, etc...
}
