package com.example.computerConfigurator.blocks;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@Entity
public class MotherBoard extends Manufacturer {
    private CaseFormFactor caseFormFactor;
    private RamType ramType;
    private CpuSocket cpuSocket;
    private HddType hddType;
    @OneToOne
    private SystemBlock systemBlock;
}
