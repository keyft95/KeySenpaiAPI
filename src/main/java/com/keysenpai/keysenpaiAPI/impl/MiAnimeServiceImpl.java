package com.keysenpai.keysenpaiAPI.impl;


import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import com.keysenpai.keysenpaiAPI.repositories.MiAnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiAnimeServiceImpl implements MiAnimeService{

    private MiAnimeRepository miAnimeRepository;

    @Autowired
    public MiAnimeServiceImpl(MiAnimeRepository miAnimeRepository) {
        this.miAnimeRepository =miAnimeRepository;
    }

    @Override
    public List<MiAnime> ListarMisAnimes() {
        return miAnimeRepository.findAll();
    }
}
