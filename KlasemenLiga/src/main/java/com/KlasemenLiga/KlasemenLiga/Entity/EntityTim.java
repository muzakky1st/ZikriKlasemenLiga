package com.KlasemenLiga.KlasemenLiga.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "data_tim")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityTim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tim")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

}
