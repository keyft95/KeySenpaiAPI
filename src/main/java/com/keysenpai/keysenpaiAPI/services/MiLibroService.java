package com.keysenpai.keysenpaiAPI.services;

import com.keysenpai.keysenpaiAPI.entities.MiLibro;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MiLibroService {
    public List<MiLibro> listarMisLibros();
    public Long addMiLibroToMyLibros(MiLibro miLibro);
    public void eliminarLibroDeMiLista(Long idMiLibro);
    public void actualizarLibroDeMiLista(Long idMiLibro, EstadoMiAnimeMiLibro estadoMiLibro);
    public List<MiLibro> getMisLibrosByUser(Long idUsuario);
}
