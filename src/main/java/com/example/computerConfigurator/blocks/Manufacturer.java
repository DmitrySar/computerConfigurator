package com.example.computerConfigurator.blocks;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Data
public class Manufacturer {
    @Id
    @GeneratedValue
    private int id;
    private String vendor;
    private String model;
    private int price;
    @OneToOne
    private Cpu cpu;
}
