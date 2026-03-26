package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "burger")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Double price;
    private Boolean isVegan;

    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    private String contents;
}