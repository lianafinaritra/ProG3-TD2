package com.example.prog3td2.service;

import com.example.prog3td2.model.SponsorEntity;
import com.example.prog3td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private SponsorRepository repository;

    public List<SponsorEntity> getSponsors() {
        return repository.findAll();
    }
}
