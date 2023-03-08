package com.example.sakila.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;

    private String title;

    private String description;

    @ManyToMany
            @JoinTable(
                    name = "film_actor",
                    joinColumns = @JoinColumn(name = "film_id"),
                    inverseJoinColumns = @JoinColumn(name = "actor_id")
            )
    List<Actor> actors;
}
