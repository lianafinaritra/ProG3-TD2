package com.example.prog3td2.service;

import com.example.prog3td2.model.PlayerEntity;
import com.example.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository repository;

    public List<PlayerEntity> getTeams() {
        return repository.findAll();
    }
}
