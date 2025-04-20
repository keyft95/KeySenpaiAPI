package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MiAnimeRepository extends JpaRepository<MiAnime, Long> {

    public List<MiAnime> getAllByUsuario_Id(Long idUsuario);
}
