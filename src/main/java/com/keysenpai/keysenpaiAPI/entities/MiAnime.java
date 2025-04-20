package com.keysenpai.keysenpaiAPI.entities;

import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import jakarta.persistence.*;

@Entity
@Table(name = "misAnimes")
public class MiAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMiAnime;
    @Enumerated(EnumType.STRING)
    private EstadoMiAnimeMiLibro estadoMiAnime;
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

    public EstadoMiAnimeMiLibro getEstadoMiAnime() {
        return estadoMiAnime;
    }

    public void setEstadoMiAnime(EstadoMiAnimeMiLibro estadoMiAnimeMiLibro) {
        this.estadoMiAnime = estadoMiAnimeMiLibro;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
