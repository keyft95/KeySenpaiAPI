package com.keysenpai.keysenpaiAPI.entities;

import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnime;
import jakarta.persistence.*;

@Entity
@Table(name = "misAnimes")
public class MiAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMiAnime;
    @Enumerated(EnumType.STRING)
    private EstadoMiAnime estadoMiAnime;
    private double puntuacion = 0;

    @ManyToOne
    @JoinColumn(name = "idAnime", nullable = false)
    private Anime anime;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    public Long getIdMiAnime() {
        return idMiAnime;
    }

    public void setIdMiAnime(Long idMiAnime) {
        this.idMiAnime = idMiAnime;
    }

    public EstadoMiAnime getEstadoMiAnime() {
        return estadoMiAnime;
    }

    public void setEstadoMiAnime(EstadoMiAnime estadoMiAnime) {
        this.estadoMiAnime = estadoMiAnime;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }
}
