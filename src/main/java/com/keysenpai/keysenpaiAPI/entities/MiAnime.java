package com.keysenpai.keysenpaiAPI.entities;

import com.keysenpai.keysenpaiAPI.enums.Estado;
import jakarta.persistence.*;

@Entity
@Table(name = "misAnimes")
public class MiAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMiAnime;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private double puntuacion = 0;

    @ManyToOne
    @JoinColumn(name = "idAnime", nullable = false)
    private Anime anime;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

}
