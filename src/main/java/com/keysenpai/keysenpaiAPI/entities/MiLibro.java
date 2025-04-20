package com.keysenpai.keysenpaiAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import jakarta.persistence.*;

@Entity
@Table(name = "MisLibros")
public class MiLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMiLibro;
    @Enumerated(EnumType.STRING)
    private EstadoMiAnimeMiLibro estadoMiLibro;
    private double puntuacionMiLibro = 0;

    @ManyToOne
    @JoinColumn(name = "idLibro", nullable = false)
    private Libro libro;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    public Long getIdMiLibro() {
        return idMiLibro;
    }

    public void setIdMiLibro(Long idMiLibro) {
        this.idMiLibro = idMiLibro;
    }

    public EstadoMiAnimeMiLibro getEstadoMiLibro() {
        return estadoMiLibro;
    }

    public void setEstadoMiLibro(EstadoMiAnimeMiLibro estadoMiLibro) {
        this.estadoMiLibro = estadoMiLibro;
    }

    public double getPuntuacionMiLibro() {
        return puntuacionMiLibro;
    }

    public void setPuntuacionLibro(double puntuacionLibro) {
        this.puntuacionMiLibro = puntuacionLibro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
