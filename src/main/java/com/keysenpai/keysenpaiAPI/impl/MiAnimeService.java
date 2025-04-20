package com.keysenpai.keysenpaiAPI.impl;

import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MiAnimeService {
    public List<MiAnime> listarMisAnimes();
    public Long addAnimeToMyList(MiAnime miAnime);
    public void eliminarAnimeDeMiLista(Long idMianime);
    public void actualizarAnimeDeMiLista(Long idMiAnime, EstadoMiAnimeMiLibro estadoMiAnimeMiLibro);
    public List<MiAnime> getMisAnimesByUser(Long idUsuario);


}
