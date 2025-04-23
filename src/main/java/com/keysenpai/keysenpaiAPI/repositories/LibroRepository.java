package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    public List<Libro> findAllByNombreEspannolContainsIgnoreCaseOrNombreJaponesContainsIgnoreCaseOrNombreInglesContainsIgnoreCase(String a, String b, String c);
}
