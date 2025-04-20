package com.keysenpai.keysenpaiAPI.dtos;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.entities.Libro;
import com.keysenpai.keysenpaiAPI.entities.MiLibro;
import com.keysenpai.keysenpaiAPI.entities.Usuario;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;

public class MiLibroDTO {
    private EstadoMiAnimeMiLibro estadoMiLibro;
    private double puntuacion;
    private Libro libro;

    public EstadoMiAnimeMiLibro getEstadoMiLibro() {
        return estadoMiLibro;
    }

    public void setEstadoMiLibro(EstadoMiAnimeMiLibro estadoMiLibro) {
        this.estadoMiLibro = estadoMiLibro;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Libro getMiLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

}
