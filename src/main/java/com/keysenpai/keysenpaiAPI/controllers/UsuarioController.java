package com.keysenpai.keysenpaiAPI.controllers;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.entities.Usuario;
import com.keysenpai.keysenpaiAPI.services.UsuarioService;
import com.keysenpai.keysenpaiAPI.responses.GenericResponse;
import com.keysenpai.keysenpaiAPI.responses.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("misUsuarios")
public class UsuarioController {
    private UsuarioService usuarioService;


    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> all() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(usuarioService.listarUsuarios()));
    }

    @PostMapping
    public ResponseEntity<GenericResponse> crearUsuario(@RequestBody Usuario usuario) {

        try{
            Long newId = this.usuarioService.crearUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new GenericResponse(new UsuarioResponse(newId)));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> getUsuario(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(usuarioService.buscarUsuario(id)));
    }

    @DeleteMapping("/{id}/")
    public ResponseEntity<String> deshabilitarUsuario(@PathVariable Long id) {
        usuarioService.deshabilitarUsuario(id);
        return ResponseEntity.ok("Usuario deshabilitado correctamente");
    }

    @GetMapping(value = "/search/{keywords}")
    public ResponseEntity<GenericResponse> searchByName(@PathVariable String keywords){
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(usuarioService.searchByName(keywords)));

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable Long id, @RequestBody Usuario usuario) {
        try {
            usuario.setId(id);
            usuarioService.actualizarUsuario(usuario);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new GenericResponse("actualizado"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

}
