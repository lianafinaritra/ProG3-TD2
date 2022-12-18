package com.example.prog3td2.controller;

import com.example.prog3td2.model.MatchEntity;
import com.example.prog3td2.model.TeamEntity;
import com.example.prog3td2.service.MatchService;
import com.example.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private MatchService service;

    @GetMapping("/matchs")
    public List<MatchEntity> getMatchs() {
        return service.getMatchs();
    }
}
