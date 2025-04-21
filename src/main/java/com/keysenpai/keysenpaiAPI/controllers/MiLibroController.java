package com.keysenpai.keysenpaiAPI.controllers;

import com.keysenpai.keysenpaiAPI.dtos.MiLibroDTO;
import com.keysenpai.keysenpaiAPI.entities.MiLibro;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import com.keysenpai.keysenpaiAPI.services.MiLibroService;
import com.keysenpai.keysenpaiAPI.responses.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("misLibros")
public class MiLibroController {
    private MiLibroService miLibroService;

    @Autowired
    public MiLibroController(MiLibroService miLibroService) {
        this.miLibroService = miLibroService;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> all() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(miLibroService.listarMisLibros()));
    }

    @PostMapping
    public ResponseEntity<GenericResponse> addLibroToMyLibros(@RequestBody MiLibro miLibro) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new GenericResponse(miLibroService.addMiLibroToMyLibros(miLibro)));
    }

    @GetMapping(value = "/{idUsuario}")
    public ResponseEntity<GenericResponse> getMisLibrosByUser(@PathVariable Long idUsuario) {
        List<MiLibro> misLibros = miLibroService.getMisLibrosByUser(idUsuario);
        List<MiLibroDTO> misLibrosResult = new ArrayList<>();
        for (MiLibro miLibro:misLibros) {
            MiLibroDTO libroDTO = new MiLibroDTO();
            libroDTO.setLibro(miLibro.getLibro());
            libroDTO.setEstadoMiLibro(miLibro.getEstadoMiLibro());
            libroDTO.setPuntuacion(miLibro.getPuntuacionMiLibro());
            misLibrosResult.add(libroDTO);
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(misLibrosResult));
    }

    @DeleteMapping(value = "/{idMiLibro}")
    public ResponseEntity<GenericResponse> eliminarLibroDeMiLista(@PathVariable Long idMiLibro) {
        try {
            this.miLibroService.eliminarLibroDeMiLista(idMiLibro);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new GenericResponse("Se ha eliminado el libro de la lista"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

    @PutMapping(value = "cambiarEstado/{idMiLibro}/{estadoMiLibro}")
    public ResponseEntity<GenericResponse> cambiarEstadoLibroDeMiLista(@PathVariable Long idMiLibro, @PathVariable EstadoMiAnimeMiLibro estadoMiLibro) {
        try {
            this.miLibroService.actualizarLibroDeMiLista(idMiLibro, estadoMiLibro);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new GenericResponse("Se ha cambiado el estado a "+ estadoMiLibro));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

}
