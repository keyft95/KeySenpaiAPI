package com.keysenpai.keysenpaiAPI.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Canciones")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCancion;
    private String nombreCancion;
    private String artista;
    private String linkYouTube;
    private String linkSpotify;
    @ManyToOne
    @JoinColumn(name="idAnime")
    private Anime anime;

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int id) {
        this.idCancion = id;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getLinkYouTube() {
        return linkYouTube;
    }

    public void setLinkYouTube(String linkYouTube) {
        this.linkYouTube = linkYouTube;
    }

    public String getLinkSpotify() {
        return linkSpotify;
    }

    public void setLinkSpotify(String linkSpotify) {
        this.linkSpotify = linkSpotify;
    }
}
