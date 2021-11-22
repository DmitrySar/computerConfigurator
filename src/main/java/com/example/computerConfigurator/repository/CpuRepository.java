package com.example.computerConfigurator.repository;

import com.example.computerConfigurator.blocks.Cpu;
import com.example.computerConfigurator.blocks.CpuSocket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CpuRepository extends CrudRepository<Cpu, Integer> {
    Optional<Cpu> findFirstByOrderByIdDesc();
    List<Cpu> findDistinctByCpuSocket(CpuSocket cpuSocket);
    List<Cpu> findDistinctByManufacturerModel(String model);
}
