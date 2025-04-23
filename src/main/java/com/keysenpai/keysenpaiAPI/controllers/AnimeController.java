package com.keysenpai.keysenpaiAPI.controllers;

import com.keysenpai.keysenpaiAPI.entities.Anime;
import com.keysenpai.keysenpaiAPI.services.AnimeService;
import com.keysenpai.keysenpaiAPI.responses.AnimeResponse;
import com.keysenpai.keysenpaiAPI.responses.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animes")
public class AnimeController {

    private AnimeService animeService;

    @Autowired
    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> all() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(animeService.ListarAnimes()));
    }

    @PostMapping
    public ResponseEntity<GenericResponse> create(@RequestBody Anime anime){
        try{
            Long newId = this.animeService.crearAnime(anime);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new GenericResponse(new AnimeResponse(newId)));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> getAnime(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(animeService.buscarAnime(id)));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deshabilitarAnime(@PathVariable Long id) {
        animeService.deshabilitarAnime(id);
        return ResponseEntity.ok("Anime deshabilitado correctamente");
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable Long id, @RequestBody Anime anime) {
        try {
            anime.setIdAnime(id);
            animeService.actualizarAnime(anime);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new GenericResponse("actualizado"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

    @GetMapping(value = "/search/{keywords}")
    public ResponseEntity<GenericResponse> searchByName(@PathVariable String keywords){
        return ResponseEntity.status(HttpStatus.OK)
                    .body(new GenericResponse(animeService.searchByName(keywords)));

    }

}
