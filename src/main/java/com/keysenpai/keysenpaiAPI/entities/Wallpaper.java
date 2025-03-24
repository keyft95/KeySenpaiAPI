package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Wallpapers")
public class Wallpaper {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private int idWallpaper;
    private String nombre;
    private String link;
    private String tamanno;
    @ManyToOne
    @JoinColumn(name = "idTemporada", nullable = false)
    private Temporada temporada;

    public int getIdWallpaper() {
        return idWallpaper;
    }

    public void setIdWallpaper(int idWallpaper) {
        this.idWallpaper = idWallpaper;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
}
