package com.example.prog3td2.controller;

import com.example.prog3td2.controller.mapper.MatchRestMapper;
import com.example.prog3td2.controller.response.MatchResponse;
import com.example.prog3td2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private MatchService service;
    private MatchRestMapper mapper;

    @GetMapping("/matchs")
    public List<MatchResponse> getMatchs() {
        return service.getMatchs().stream()
                .map(mapper::toRest)
                .toList();
    }
}
