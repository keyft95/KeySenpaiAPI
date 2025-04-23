package com.keysenpai.keysenpaiAPI.repositories;

import com.keysenpai.keysenpaiAPI.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   public List<Usuario> findAllByNombreContainsIgnoreCaseOrNombrePerfilContainsIgnoreCase(String a, String b);
}
