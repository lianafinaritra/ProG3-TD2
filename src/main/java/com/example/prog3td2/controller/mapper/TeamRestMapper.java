package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.TeamResponse;
import com.example.prog3td2.model.PlayerEntity;
import com.example.prog3td2.model.TeamEntity;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain) {
        List<PlayerEntity> restPlayers = domain.getPlayers();
        restPlayers.sort(Comparator.comparing(PlayerEntity::getNumber));
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(restPlayers)
                .sponsors(domain.getSponsors())
                .build();
    }
}
