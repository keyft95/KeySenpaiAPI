package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Generos")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGenero;
    private String nombre;
    private String nombreJapones;
    private String descripcion;
    @OneToMany(mappedBy="genero")
    private List<GeneroPorAnime> generosPorAnimes;

    @OneToMany(mappedBy="genero")
    private List<GeneroPorLibro> generosPorlibros;



    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public void setNombreJapones(String nombreJapones) {
        this.nombreJapones = nombreJapones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
