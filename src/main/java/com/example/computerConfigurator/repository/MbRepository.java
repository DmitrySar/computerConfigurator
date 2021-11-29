package com.example.computerConfigurator.repository;

import com.example.computerConfigurator.blocks.MotherBoard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MbRepository extends CrudRepository<MotherBoard, Integer> {
    Optional<MotherBoard> findFirstByOrderByIdDesc();
}
