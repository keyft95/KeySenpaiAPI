package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Capitulos")
public class Capitulo {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private int idCapitulo;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idTemporada", nullable = false)
    private Temporada temporada;
}
