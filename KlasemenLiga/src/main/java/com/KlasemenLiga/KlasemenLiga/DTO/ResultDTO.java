package com.KlasemenLiga.KlasemenLiga.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultDTO {
    private Long id;
    private String name;
    private String city;
    private Integer rank;
    private Integer points;
    private Integer win;
    private Integer lost;
    private Integer draw;
    private Integer numberOfMatch;
    private Integer homeGoal;
    private Integer awayGoal;
}
