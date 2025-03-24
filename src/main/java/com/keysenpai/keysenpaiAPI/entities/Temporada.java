package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

import java.util.List;

@Entity
@Table(name = "Temporadas")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTemporada;
    private int numero;
    private String nombre;
    private String imagen;
    private LocalDate anno;
    @OneToMany(mappedBy="temporada")
    private List<Capitulo> capitulos;

    @OneToMany(mappedBy="temporada")
    private List<Wallpaper> wallpapers;


    @ManyToOne
    @JoinColumn(name = "idAnime", nullable = false)
    private Anime anime;


    public int getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(int idTemporada) {
        this.idTemporada = idTemporada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getAnno() {
        return anno;
    }

    public void setAnno(LocalDate anno) {
        this.anno = anno;
    }
}
