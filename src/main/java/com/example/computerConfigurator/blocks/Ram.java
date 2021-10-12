package com.example.computerConfigurator.blocks;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@Entity
public class Ram extends Manufacturer {
    private RamType ramType;
    private int size;
}
