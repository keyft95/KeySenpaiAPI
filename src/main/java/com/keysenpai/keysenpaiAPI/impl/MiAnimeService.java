package com.keysenpai.keysenpaiAPI.impl;

import com.keysenpai.keysenpaiAPI.entities.Libro;
import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MiAnimeService {
    public List<MiAnime> ListarMisAnimes();
    //public void eliminarMiAnime(Long id);


}
