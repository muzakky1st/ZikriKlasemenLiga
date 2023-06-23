package com.KlasemenLiga.KlasemenLiga.DTO;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer homeTeamGoal;
    private Integer awayTeamGoal;

}
