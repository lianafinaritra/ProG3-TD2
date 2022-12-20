package com.example.prog3td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MatchResponse {
    private int id;

    private LocalDate datetime;

    private String teamOneName;

    private String teamTwoName;
}
