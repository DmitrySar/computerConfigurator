package com.example.computerConfigurator.blocks;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Cpu {
    @Id
    @GeneratedValue
    private int id;
    private CpuSocket cpuSocket;
    @OneToOne(cascade = CascadeType.ALL)
    private Manufacturer manufacturer;

}
