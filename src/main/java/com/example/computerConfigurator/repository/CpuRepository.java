package com.example.computerConfigurator.repository;

import com.example.computerConfigurator.blocks.Cpu;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CpuRepository extends CrudRepository<Cpu, Integer> {
    Optional<Cpu> findFirstByOrderByIdDesc();
}
