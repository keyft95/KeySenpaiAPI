package com.keysenpai.keysenpaiAPI.services.impl;

import com.keysenpai.keysenpaiAPI.entities.MiLibro;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import com.keysenpai.keysenpaiAPI.repositories.MiLibroRepository;
import com.keysenpai.keysenpaiAPI.services.MiLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MiLibroServiceImpl implements MiLibroService {

    private MiLibroRepository miLibroRepository;

    @Autowired
    public MiLibroServiceImpl(MiLibroRepository miLibroRepository) {
        this.miLibroRepository =miLibroRepository;
    }

    @Override
    public List<MiLibro> listarMisLibros() {
        return miLibroRepository.findAll();
    }

    @Override
    public List<MiLibro> getMisLibrosByUser(Long idUsuario) {
        return miLibroRepository.getAllByUsuario_Id(idUsuario);
    }



    @Override
    public void eliminarLibroDeMiLista(Long idMiLibro) {
        miLibroRepository.deleteById(idMiLibro);
    }

    @Override
    public void actualizarLibroDeMiLista(Long idMiLibro, EstadoMiAnimeMiLibro estadoMiAnimeMiLibro) {
        Optional<MiLibro> optionalMiLibro = miLibroRepository.findById(idMiLibro);
        if(optionalMiLibro.isPresent()) {
            MiLibro miLibro = optionalMiLibro.get();
            miLibro.setEstadoMiLibro(estadoMiAnimeMiLibro);
            miLibroRepository.save(miLibro);
        }
    }

    @Override
    public Long addMiLibroToMyLibros(MiLibro miLibro) {
        miLibroRepository.save(miLibro);
        return miLibro.getIdMiLibro();
    }
}
