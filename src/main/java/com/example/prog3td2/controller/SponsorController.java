package com.example.prog3td2.controller;

import com.example.prog3td2.model.SponsorEntity;
import com.example.prog3td2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private SponsorService service;

    @GetMapping("/sponsors")
    public List<SponsorEntity> getTeams() {
        return service.getSponsors();
    }
}
