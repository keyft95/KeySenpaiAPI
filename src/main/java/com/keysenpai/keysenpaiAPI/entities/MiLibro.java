package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MisLibros")
public class MiLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMiLibro;
    private int estadoLibro;
    private double puntuacionLibro;

    @ManyToOne
    @JoinColumn(name = "idLibro", nullable = false)
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
}
