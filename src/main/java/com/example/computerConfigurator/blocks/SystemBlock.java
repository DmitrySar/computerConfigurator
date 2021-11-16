package com.example.computerConfigurator.blocks;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class SystemBlock {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Manufacturer manufacturer;
    @OneToOne
    private CaseBlock caseBlock;
    @OneToOne
    private MotherBoard motherBoard;
    @OneToOne
    private Cpu cpu;
    @OneToMany
    private List<Ram> ramList;
    @OneToMany
    private List<Hdd> hddList;
    private boolean integratedVideoCard;
    @OneToOne
    private VideoCard videoCard;

}
