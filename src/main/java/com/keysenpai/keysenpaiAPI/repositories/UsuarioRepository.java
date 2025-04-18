package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
