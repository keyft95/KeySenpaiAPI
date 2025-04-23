package com.keysenpai.keysenpaiAPI.services;

import com.keysenpai.keysenpaiAPI.entities.Anime;

import java.util.List;

public interface AnimeService {
    public Long crearAnime(Anime anime);
    public Anime buscarAnime(Long id);
//    public void eliminarAnime(Long id);
    public void actualizarAnime(Anime anime);
    public List<Anime> ListarAnimes();
    public List<Anime> searchByName(String keywords);
    public void deshabilitarAnime(Long id);
}
