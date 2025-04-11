package com.keysenpai.keysenpaiAPI.impl;

import com.keysenpai.keysenpaiAPI.entities.Anime;

import java.util.List;

public interface AnimeService {
    public Long crearAnime(Anime anime);
    public Anime buscarAnime(Long id);
    public void eliminarAnime(Long id);
    public void actualizarAnime(Anime anime);
    public List<Anime> ListarAnimes();
}
