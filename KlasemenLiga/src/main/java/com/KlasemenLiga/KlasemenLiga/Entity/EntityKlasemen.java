package com.KlasemenLiga.KlasemenLiga.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "klasemen")
public class EntityKlasemen {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rank")
    private Integer rank;

    @Column(name = "points")
    private Integer points;

    @Column(name = "win")
    private Integer win;

    @Column(name = "lost")
    private Integer lost;

    @Column(name = "draw")
    private Integer draw;

    @Column(name = "number_of_match")
    private Integer numberOfMatch;

    @Column(name = "home_goal")
    private Integer homeGoal;

    @Column (name = "away_goal")
    private Integer awayGoal;
}
