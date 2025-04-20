package com.keysenpai.keysenpaiAPI.repositories;



import com.keysenpai.keysenpaiAPI.entities.MiLibro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MiLibroRepository extends JpaRepository<MiLibro, Long> {

    public List<MiLibro> getAllByUsuario_Id(Long idUsuario);
}
