package com.KlasemenLiga.KlasemenLiga.Entity;

import com.KlasemenLiga.KlasemenLiga.DTO.Statistics;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "data_statistik")
public class EntityStatistikData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_data_statistik")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private String homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private String awayTeam;

    @Column(name = "schedule")
    private String schedule;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_is_statistics")
    private Statistics statistics;
}
