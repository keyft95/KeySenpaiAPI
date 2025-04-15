package com.keysenpai.keysenpaiAPI.impl;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeServiceImpl implements AnimeService {

   private AnimeRepository animeRepository;

   @Autowired
    public AnimeServiceImpl(AnimeRepository animeRepository) {
       this.animeRepository = animeRepository;
   }

   @Override
    public Long crearAnime(Anime anime) {
       animeRepository.save(anime);
       return anime.getIdAnime();
   }

   @Override
    public Anime buscarAnime(Long id) {
       return animeRepository.findById(id).get();
   }

   @Override
    public void eliminarAnime(Long id) {
       animeRepository.deleteById(id);
   }

   @Override
    public void actualizarAnime(Anime anime) {
       animeRepository.save(anime);
   }

   @Override
    public List<Anime> ListarAnimes() {
       return animeRepository.findAll();
   }

   @Override
    public List<Anime> searchByName(String keywords) {
       return animeRepository.findAllByNombreEspanolContainsIgnoreCaseOrNombreJaponesContainsIgnoreCaseOrNombreInglesContainsIgnoreCase(keywords, keywords, keywords);
   }
}
