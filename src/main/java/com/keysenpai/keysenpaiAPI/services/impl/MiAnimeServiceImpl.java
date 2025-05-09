package com.keysenpai.keysenpaiAPI.services.impl;

import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import com.keysenpai.keysenpaiAPI.repositories.MiAnimeRepository;
import com.keysenpai.keysenpaiAPI.services.MiAnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MiAnimeServiceImpl implements MiAnimeService {

    private MiAnimeRepository miAnimeRepository;

    @Autowired
    public MiAnimeServiceImpl(MiAnimeRepository miAnimeRepository) {
        this.miAnimeRepository =miAnimeRepository;
    }

    @Override
    public List<MiAnime> listarMisAnimes() {
        return miAnimeRepository.findAll();
    }

    @Override
    public List<MiAnime> getMisAnimesByUser(Long idUsuario) {
        return miAnimeRepository.getAllByUsuario_Id(idUsuario);
    }



    @Override
    public void eliminarAnimeDeMiLista(Long idMianime) {
        miAnimeRepository.deleteById(idMianime);
    }

    @Override
    public void actualizarAnimeDeMiLista(Long idMiAnime, EstadoMiAnimeMiLibro estadoMiAnimeMiLibro) {
        Optional<MiAnime> optionalMiAnime = miAnimeRepository.findById(idMiAnime);
        if(optionalMiAnime.isPresent()) {
            MiAnime miAnime = optionalMiAnime.get();
            miAnime.setEstadoMiAnime(estadoMiAnimeMiLibro);
            miAnimeRepository.save(miAnime);

        }
    }

    @Override
    public Long addAnimeToMyList(MiAnime miAnime) {
        miAnimeRepository.save(miAnime);
        return miAnime.getIdMiAnime();
    }
}
