package com.keysenpai.keysenpaiAPI.services;

import com.keysenpai.keysenpaiAPI.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    public List<Usuario> listarUsuarios();
    public Long crearUsuario(Usuario usuario);
    public Usuario buscarUsuario(Long id);
    public void deshabilitarUsuario(Long id);
}
