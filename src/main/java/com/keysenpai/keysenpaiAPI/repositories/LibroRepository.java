package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
