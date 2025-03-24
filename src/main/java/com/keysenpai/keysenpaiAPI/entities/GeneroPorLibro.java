package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "GenerosPorLibro")
public class GeneroPorLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGeneroPorLibro;

    @ManyToOne
    @JoinColumn(name = "idGenero", nullable = false)
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "idLibro", nullable = false)
    private Libro libro;
}
