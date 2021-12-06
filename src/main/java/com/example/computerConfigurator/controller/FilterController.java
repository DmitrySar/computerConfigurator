package com.example.computerConfigurator.controller;

import com.example.computerConfigurator.blocks.Cpu;
import com.example.computerConfigurator.blocks.MotherBoard;
import com.example.computerConfigurator.repository.CpuRepository;
import com.example.computerConfigurator.repository.MbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("filter")
public class FilterController {
    @Autowired
    CpuRepository cpuRepository;
    @Autowired
    MbRepository mbRepository;

    @GetMapping
    public String getListElements(@RequestParam(defaultValue = "") String socket,
                                  @RequestParam(defaultValue = "") String ramType,
                                  Model model) {
        List<Cpu> cpuList = StreamSupport
                .stream(cpuRepository.findAll().spliterator(), false)
                .filter(cpu -> cpu.getCpuSocket().name().contains(socket))
                .collect(Collectors.toList());
        List<MotherBoard> mbList = StreamSupport
                .stream(mbRepository.findAll().spliterator(), false)
                .filter(mb -> mb.getCpuSocket().name().contains(socket))
                .filter(mb -> mb.getRamType().name().contains(ramType))
                .collect(Collectors.toList());
        model.addAttribute("cpuList", cpuList);
        model.addAttribute("mbList", mbList);
        return "/filter";
    }
}
