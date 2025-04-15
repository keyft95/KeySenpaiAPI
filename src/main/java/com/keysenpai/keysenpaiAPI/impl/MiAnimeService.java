package com.keysenpai.keysenpaiAPI.impl;

import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnime;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MiAnimeService {
    public List<MiAnime> ListarMisAnimes();
    public Long addAnimeToMyList(MiAnime miAnime);
    public void eliminarAnimeDeMiLista(Long idMianime);
    public void actualizarAnimeDeMiLista(Long idMiAnime, EstadoMiAnime estadoMiAnime);


}
