package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String nombrePerfil;
    private String apellidos;
    private LocalDate edad;
    private String correo;
    private String fotoPerfil;
    private boolean activo = true;

    @OneToMany(mappedBy="usuario")
    private List<MiLibro> misLibros;

    @OneToMany(mappedBy="usuario")
    private List<MiAnime>misAnimes ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<MiLibro> getMisLibros() {
        return misLibros;
    }

    public void setMisLibros(List<MiLibro> misLibros) {
        this.misLibros = misLibros;
    }

    public List<MiAnime> getMisAnimes() {
        return misAnimes;
    }

    public void setMisAnimes(List<MiAnime> misAnimes) {
        this.misAnimes = misAnimes;
    }
}
