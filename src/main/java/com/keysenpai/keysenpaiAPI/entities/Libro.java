package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLibro;
    private String nombreJapones;
    private String nombreEspannol;
    private String nombreIngles;
    private String sinopsis;
    private int tipoLibro;
    private LocalDate anno;
    private int estado;
    private String imgPrincipal;
    private int ordenDeVisualizacion;
    @OneToMany(mappedBy="libro")
    private List<GeneroPorLibro> generosPorLibro;

    @OneToMany(mappedBy="libro")
    private List<MiLibro> misLibros;

    @OneToMany(mappedBy="libro")
    private List<LibroPorAnime> librosPorAnime;


    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public void setNombreJapones(String nombreJapones) {
        this.nombreJapones = nombreJapones;
    }

    public String getNombreEspannol() {
        return nombreEspannol;
    }

    public void setNombreEspannol(String nombreEspannol) {
        this.nombreEspannol = nombreEspannol;
    }

    public String getNombreIngles() {
        return nombreIngles;
    }

    public void setNombreIngles(String nombreIngles) {
        this.nombreIngles = nombreIngles;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(int tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public LocalDate getAnno() {
        return anno;
    }

    public void setAnno(LocalDate anno) {
        this.anno = anno;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getImgPrincipal() {
        return imgPrincipal;
    }

    public void setImgPrincipal(String imgPrincipal) {
        this.imgPrincipal = imgPrincipal;
    }

    public int getOrdenDeVisualizacion() {
        return ordenDeVisualizacion;
    }

    public void setOrdenDeVisualizacion(int ordenDeVisualizacion) {
        this.ordenDeVisualizacion = ordenDeVisualizacion;
    }
}
