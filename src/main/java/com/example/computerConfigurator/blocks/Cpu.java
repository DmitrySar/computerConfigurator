package com.example.computerConfigurator.blocks;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@Entity
public class Cpu extends Manufacturer {
    private CpuSocket cpuSocket;
    @OneToOne
    private SystemBlock systemBlock;
}
