package com.keysenpai.keysenpaiAPI.dtos;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.entities.Usuario;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnime;
import jakarta.persistence.*;

public class MiAnimeDTO {

    private EstadoMiAnime estadoMiAnime;
    private double puntuacion;
    private Anime anime;

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

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }
}
