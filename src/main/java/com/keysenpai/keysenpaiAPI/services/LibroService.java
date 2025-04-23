package com.keysenpai.keysenpaiAPI.services;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.entities.Libro;

import java.util.List;

public interface LibroService {
    public Long crearLibro(Libro libro);
    public Libro buscarLibro(Long id);
//    public void eliminarLibro(Long id);
    public void actualizarLibro(Libro libro);
    public List<Libro> ListarLibros();
    public List<Libro> searchByName(String keywords);

    void deshabilitarLibro(Long id);
}
