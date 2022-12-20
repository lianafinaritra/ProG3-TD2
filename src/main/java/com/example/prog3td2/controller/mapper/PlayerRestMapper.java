package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.PlayerResponse;
import com.example.prog3td2.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
