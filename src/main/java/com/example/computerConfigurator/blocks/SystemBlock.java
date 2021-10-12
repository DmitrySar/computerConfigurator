package com.example.computerConfigurator.blocks;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@SuperBuilder(toBuilder = true)
@Entity
@NoArgsConstructor
public class SystemBlock extends Manufacturer {
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
