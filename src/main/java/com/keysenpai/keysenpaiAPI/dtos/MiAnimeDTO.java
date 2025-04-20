package com.keysenpai.keysenpaiAPI.dtos;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;

public class MiAnimeDTO {

    private EstadoMiAnimeMiLibro estadoMiAnimeMiLibro;
    private double puntuacion;
    private Anime anime;

    public EstadoMiAnimeMiLibro getEstadoMiAnime() {
        return estadoMiAnimeMiLibro;
    }

    public void setEstadoMiAnime(EstadoMiAnimeMiLibro estadoMiAnimeMiLibro) {
        this.estadoMiAnimeMiLibro = estadoMiAnimeMiLibro;
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
}
