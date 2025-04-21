package com.keysenpai.keysenpaiAPI.controllers;

import com.keysenpai.keysenpaiAPI.dtos.MiAnimeDTO;
import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import com.keysenpai.keysenpaiAPI.enums.EstadoMiAnimeMiLibro;
import com.keysenpai.keysenpaiAPI.services.MiAnimeService;
import com.keysenpai.keysenpaiAPI.responses.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("misAnimes")
public class  MiAnimeController {
    private MiAnimeService miAnimeService;

    @Autowired
    public MiAnimeController(MiAnimeService miAnimeService) {
        this.miAnimeService = miAnimeService;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> all() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(miAnimeService.listarMisAnimes()));
    }

    @PostMapping
    public ResponseEntity<GenericResponse> addAnimeToMyAnimes(@RequestBody MiAnime miAnime) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new GenericResponse(miAnimeService.addAnimeToMyList(miAnime)));
    }

    @GetMapping(value = "/{idUsuario}")
    public ResponseEntity<GenericResponse> getMisAnimesByUser(@PathVariable Long idUsuario) {
        List<MiAnime> misAnimes = miAnimeService.getMisAnimesByUser(idUsuario);
        List<MiAnimeDTO> misAnimesResult = new ArrayList<>();
        for (MiAnime miAnime:misAnimes) {
            MiAnimeDTO animeDTO = new MiAnimeDTO();
            animeDTO.setAnime(miAnime.getAnime());
            animeDTO.setEstadoMiAnime(miAnime.getEstadoMiAnime());
            animeDTO.setPuntuacion(miAnime.getPuntuacion());
            misAnimesResult.add(animeDTO);
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(misAnimesResult));
    }


    @DeleteMapping(value = "/{idMiAnime}")
    public ResponseEntity<GenericResponse> eliminarAnimeDeMiLista(@PathVariable Long idMiAnime) {
        try {
            this.miAnimeService.eliminarAnimeDeMiLista(idMiAnime);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new GenericResponse("Se ha eliminado el anime de la lista"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

    @PutMapping(value = "cambiarEstado/{idMiAnime}/{estadoMiAnimeMiLibro}")
    public ResponseEntity<GenericResponse> cambiarEstadoAnimeDeMiLista(@PathVariable Long idMiAnime, @PathVariable EstadoMiAnimeMiLibro estadoMiAnimeMiLibro) {
        try {
            this.miAnimeService.actualizarAnimeDeMiLista(idMiAnime, estadoMiAnimeMiLibro);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new GenericResponse("Se ha cambiado el estado a "+ estadoMiAnimeMiLibro));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new GenericResponse(e.getMessage()));
        }
    }

}





