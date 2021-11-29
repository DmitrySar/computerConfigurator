package com.example.computerConfigurator.blocks;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class MotherBoard {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    private Manufacturer manufacturer;
    private CaseFormFactor caseFormFactor;
    private RamType ramType;
    private CpuSocket cpuSocket;
    private HddType hddType;

}
