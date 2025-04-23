package com.keysenpai.keysenpaiAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.keysenpai.keysenpaiAPI.enums.EstadoAnimeLibro;
import com.keysenpai.keysenpaiAPI.enums.TipoAnime;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Animes")
 public class Anime {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private Long idAnime;
    private String nombreJapones;
    private String nombreEspanol;
    private String nombreIngles;
    private String sinopsis;
    private boolean activo = true;

    @Enumerated(EnumType.STRING)
    private EstadoAnimeLibro estadoAnime;
    private LocalDate anno;

    @Enumerated(EnumType.STRING)
    private TipoAnime tipoAnime;
    private String imgPrincipal;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private int ordenDeVisualizacion;
    @OneToMany(mappedBy="anime")
    private List<Cancion> canciones;

    @OneToMany(mappedBy="anime")
    private List<LibroPorAnime> librosPorAnimes;
    @JsonIgnore
    @OneToMany(mappedBy="anime")
    private List<MiAnime> misAnimes;

    @OneToMany(mappedBy="anime")
    private List<GeneroPorAnime> generosPorAnimes;

    @OneToMany(mappedBy="anime")
    private List<Temporada> temporadas;


    public Long getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Long idAnime) {
        this.idAnime = idAnime;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public void setNombreJapones(String nombreJapones) {
        this.nombreJapones = nombreJapones;
    }

    public String getNombreEspanol() {
        return nombreEspanol;
    }

    public void setNombreEspanol(String nombreEspanol) {
        this.nombreEspanol = nombreEspanol;
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

    public Enum getEstadoAnime() {
        return estadoAnime;
    }

    public void setEstadoAnime(EstadoAnimeLibro estadoAnime) {
        this.estadoAnime = estadoAnime;
    }

    public LocalDate getAnno() {
        return anno;
    }

    public void setAnno(LocalDate anno) {
        this.anno = anno;
    }

    public Enum getTipoAnime() {
        return tipoAnime;
    }

    public void setTipoAnime(TipoAnime tipoAnime) {
        this.tipoAnime = tipoAnime;
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

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public List<LibroPorAnime> getLibrosPorAnimes() {
        return librosPorAnimes;
    }

    public void setLibrosPorAnimes(List<LibroPorAnime> librosPorAnimes) {
        this.librosPorAnimes = librosPorAnimes;
    }

    public List<MiAnime> getMisAnimes() {
        return misAnimes;
    }

    public void setMisAnimes(List<MiAnime> misAnimes) {
        this.misAnimes = misAnimes;
    }

    public List<GeneroPorAnime> getGenerosPorAnimes() {
        return generosPorAnimes;
    }

    public void setGenerosPorAnimes(List<GeneroPorAnime> generosPorAnimes) {
        this.generosPorAnimes = generosPorAnimes;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
