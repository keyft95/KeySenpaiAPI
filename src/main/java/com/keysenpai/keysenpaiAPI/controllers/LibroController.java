package com.keysenpai.keysenpaiAPI.controllers;


import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.entities.Libro;
import com.keysenpai.keysenpaiAPI.impl.LibroService;
import com.keysenpai.keysenpaiAPI.responses.AnimeResponse;
import com.keysenpai.keysenpaiAPI.responses.GenericResponse;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("libros")
public class LibroController {
    private LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> all() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(libroService.ListarLibros()));
    }

    @PostMapping
    public ResponseEntity<GenericResponse> create(@RequestBody Libro libro) {
        try {
            Long newId = this.libroService.crearLibro(libro);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new GenericResponse(new AnimeResponse(newId)));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> getLibro(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(libroService.buscarLibro(id)));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> eliminar(@PathVariable Long id) {
        try {
            this.libroService.eliminarLibro(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new GenericResponse("Libro eliminado"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable Long id, @RequestBody Libro libro) {
        try {
            libro.setIdLibro(id);
            libroService.actualizarLibro(libro);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new GenericResponse("Libro actualizado"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }
}
