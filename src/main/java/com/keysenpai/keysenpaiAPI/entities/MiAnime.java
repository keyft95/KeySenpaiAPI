package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "misAnimes")
public class MiAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMiAnime;
    private int estado;
    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "idAnime", nullable = false)
    private Anime anime;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

}
