package com.keysenpai.keysenpaiAPI.entities;

import com.keysenpai.keysenpaiAPI.enums.EstadoAnimeLibro;
import com.keysenpai.keysenpaiAPI.enums.TipoLibro;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLibro;
    private String nombreJapones;
    private String nombreEspannol;
    private String nombreIngles;
    private String sinopsis;

    @Enumerated(EnumType.STRING)
    private TipoLibro tipoLibro;
    private LocalDate anno;

    @Enumerated(EnumType.STRING)
    private EstadoAnimeLibro estadoAnimeLibro;
    private String imgPrincipal;
    private int ordenDeVisualizacion;
    @OneToMany(mappedBy="libro")
    private List<GeneroPorLibro> generosPorLibro;

    @OneToMany(mappedBy="libro")
    private List<MiLibro> misLibros;

    @OneToMany(mappedBy="libro")
    private List<LibroPorAnime> librosPorAnime;


    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
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

    public TipoLibro getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(TipoLibro tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public LocalDate getAnno() {
        return anno;
    }

    public void setAnno(LocalDate anno) {
        this.anno = anno;
    }

    public EstadoAnimeLibro getEstadoAnimeLibro() {
        return estadoAnimeLibro;
    }

    public void setEstado(EstadoAnimeLibro estadoAnimeLibro) {
        this.estadoAnimeLibro = estadoAnimeLibro;
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

    public List<GeneroPorLibro> getGenerosPorLibro() {
        return generosPorLibro;
    }

    public void setGenerosPorLibro(List<GeneroPorLibro> generosPorLibro) {
        this.generosPorLibro = generosPorLibro;
    }

    public List<MiLibro> getMisLibros() {
        return misLibros;
    }

    public void setMisLibros(List<MiLibro> misLibros) {
        this.misLibros = misLibros;
    }

    public List<LibroPorAnime> getLibrosPorAnime() {
        return librosPorAnime;
    }

    public void setLibrosPorAnime(List<LibroPorAnime> librosPorAnime) {
        this.librosPorAnime = librosPorAnime;
    }
}
