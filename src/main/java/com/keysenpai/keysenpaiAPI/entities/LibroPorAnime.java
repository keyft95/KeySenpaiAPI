package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "LibrosPorAnime")
public class LibroPorAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLibroPorAnime;

    @ManyToOne
    @JoinColumn(name = "idLibro", nullable = false)
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "idAnime", nullable = false)
    private Anime anime;

}
