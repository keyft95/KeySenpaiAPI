package com.keysenpai.keysenpaiAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Animes")
 public class Anime {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private int idAnime;
    private String nombreJapones;
    private String nombreEspanol;
    private String nombreIngles;
    private String sinopsis;
    private int estado;
    private int anno;
    private int tipoAnime;
    private String imgPrincipal;
    private int ordenDeVisualizacion;
    @OneToMany(mappedBy="anime")
    private List<Cancion> canciones;



   public int getIdAnime() {
      return idAnime;
   }


   public void setIdAnime(int id) {
      this.idAnime = id;
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

   public int getEstado() {
      return estado;
   }

   public void setEstado(int estado) {
      this.estado = estado;
   }

   public int getAnno() {
      return anno;
   }

   public void setAnno(int anno) {
      this.anno = anno;
   }

   public int getTipoAnime() {
      return tipoAnime;
   }

   public void setTipoAnime(int tipoAnime) {
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


}
