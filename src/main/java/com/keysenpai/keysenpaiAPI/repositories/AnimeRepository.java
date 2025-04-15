package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;




public interface AnimeRepository extends JpaRepository<Anime, Long> {

    public List<Anime> findAllByNombreEspanolContainsIgnoreCaseOrNombreJaponesContainsIgnoreCaseOrNombreInglesContainsIgnoreCase(String a, String b, String c);
}
