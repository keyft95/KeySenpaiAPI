package com.keysenpai.keysenpaiAPI.services.impl;


import com.keysenpai.keysenpaiAPI.entities.Libro;
import com.keysenpai.keysenpaiAPI.repositories.LibroRepository;
import com.keysenpai.keysenpaiAPI.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    private LibroRepository libroRepository;

    @Autowired
    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public Long crearLibro(Libro libro) {
        libroRepository.save(libro);
        return libro.getIdLibro();
    }

    @Override
    public Libro buscarLibro(Long id) {
        return libroRepository.findById(id).get();
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public List<Libro> ListarLibros() {
        return libroRepository.findAll();
    }


}
