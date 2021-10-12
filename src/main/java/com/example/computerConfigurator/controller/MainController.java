package com.example.computerConfigurator.controller;

import com.example.computerConfigurator.blocks.Cpu;
import com.example.computerConfigurator.blocks.CpuSocket;
import com.example.computerConfigurator.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.computerConfigurator.repository.CpuRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private CpuRepository cpuRepository;
    private ManufacturerRepository manufacturerRepository;

    @Autowired
    public MainController(CpuRepository cpuRepository, ManufacturerRepository manufacturerRepository) {
        this.cpuRepository = cpuRepository;
        this.manufacturerRepository = manufacturerRepository;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("cpuList", cpuRepository.findAll());
        model.addAttribute("cpu", new Cpu());
        return "index";
    }

    @PostMapping("/")
    public String postCpu(@ModelAttribute Cpu cpu, Model model) {
        model.addAttribute("cpu", cpu);
        manufacturerRepository.save(cpu.getManufacturer());
        cpuRepository.save(cpu);
        return "index";
    }
}
