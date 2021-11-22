package com.example.computerConfigurator.repository;

import com.example.computerConfigurator.blocks.Manufacturer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {
    List<Manufacturer> findDistinctByModel(String model);
}
