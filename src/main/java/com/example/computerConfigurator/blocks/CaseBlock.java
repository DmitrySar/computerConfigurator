package com.example.computerConfigurator.blocks;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Data
public class CaseBlock {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Manufacturer manufacturer;
    private CaseFormFactor formFactor;
}
