package com.example.prog3td2.service;

import com.example.prog3td2.model.MatchEntity;
import com.example.prog3td2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private MatchRepository repository;

    public List<MatchEntity> getMatchs() {
        return repository.findAll();
    }
}
