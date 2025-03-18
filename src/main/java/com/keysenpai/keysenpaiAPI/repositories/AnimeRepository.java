package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;



public interface AnimeRepository extends JpaRepository<Anime, Integer> {
    Optional<Anime> findById(int id);
}
