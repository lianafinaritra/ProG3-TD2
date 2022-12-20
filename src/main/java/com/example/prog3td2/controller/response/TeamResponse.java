package com.example.prog3td2.controller.response;

import com.example.prog3td2.model.PlayerEntity;
import com.example.prog3td2.model.SponsorEntity;
import com.example.prog3td2.model.TeamEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id;

    private String name;

    private List<PlayerEntity> players;

    private List<SponsorEntity> sponsors;
}
