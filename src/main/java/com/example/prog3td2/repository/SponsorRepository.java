package com.example.prog3td2.repository;

import com.example.prog3td2.model.SponsorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {
}
