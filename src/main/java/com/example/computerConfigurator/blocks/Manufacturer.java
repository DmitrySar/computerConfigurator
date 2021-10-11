package com.example.computerConfigurator.blocks;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@Getter
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue
    private int id;
    private String vendor;
    private String model;
    private int price;
}
