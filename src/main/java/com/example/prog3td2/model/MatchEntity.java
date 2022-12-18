package com.example.prog3td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "play_against")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate datetime;
    private String stadium;

    @OneToOne
    private TeamEntity teamOne;

    @OneToOne
    private TeamEntity teamTwo;
}
