package com.example.prog3td2.service;

import com.example.prog3td2.model.TeamEntity;
import com.example.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository repository;

    public List<TeamEntity> getTeams() {
        return repository.findAll();
    }
}
