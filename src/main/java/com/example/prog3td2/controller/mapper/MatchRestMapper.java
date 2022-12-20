package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.MatchResponse;
import com.example.prog3td2.model.MatchEntity;
import org.springframework.stereotype.Component;

@Component
public class MatchRestMapper {
    public MatchResponse toRest(MatchEntity domain) {
        return MatchResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .teamOneName(domain.getTeamOne().getName())
                .teamTwoName(domain.getTeamTwo().getName())
                .build();
    }
}
