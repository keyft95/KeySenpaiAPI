package com.keysenpai.keysenpaiAPI.services.impl;


import com.keysenpai.keysenpaiAPI.entities.Usuario;
import com.keysenpai.keysenpaiAPI.repositories.UsuarioRepository;
import com.keysenpai.keysenpaiAPI.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Long crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario.getId();
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuario(Long id){
        return usuarioRepository.findById(id).get();
    }

    @Override
    public void deshabilitarUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuario.setActivo(false);
        usuarioRepository.save(usuario);

    }
}
