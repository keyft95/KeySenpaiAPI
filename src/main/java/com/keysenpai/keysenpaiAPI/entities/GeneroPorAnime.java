package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "GenerosPorAnime")
public class GeneroPorAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGenerPorAnime;

    @ManyToOne
    @JoinColumn(name = "idAnime", nullable = false)
    private Anime anime;

    @ManyToOne
    @JoinColumn(name = "idGenero", nullable = false)
    private Genero genero;
}
