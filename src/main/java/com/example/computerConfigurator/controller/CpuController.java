package com.example.computerConfigurator.controller;

import com.example.computerConfigurator.blocks.Cpu;
import com.example.computerConfigurator.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.computerConfigurator.repository.CpuRepository;

@Controller
@RequestMapping("/cpu")
public class CpuController {
    private CpuRepository cpuRepository;

    @Autowired
    public CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }

    @GetMapping
    public String mainPage(Model model) {
        model.addAttribute("cpuList", cpuRepository.findAll());
        model.addAttribute("cpu", cpuRepository.findFirstByOrderByIdDesc().orElse(new Cpu()));
        return "cpu";
    }

    @GetMapping("delcpu")
    public String delCpu(@RequestParam int id) {
        Cpu cpu = cpuRepository.findById(id).get();
        cpuRepository.delete(cpu);
        return "redirect:/addcomponents#cpu";
    }

    @PostMapping("add")
    public String postCpu(@ModelAttribute Cpu cpu, Model model) {
        model.addAttribute("cpu", cpu);
        cpuRepository.save(cpu);
        return "redirect:/cpu";
    }
}
