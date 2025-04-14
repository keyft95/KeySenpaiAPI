package com.keysenpai.keysenpaiAPI.controllers;


import com.keysenpai.keysenpaiAPI.entities.MiAnime;
import com.keysenpai.keysenpaiAPI.impl.MiAnimeService;
import com.keysenpai.keysenpaiAPI.responses.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("misAnimes")
public class MiAnimeController {
    private MiAnimeService miAnimeService;

    @Autowired
    public MiAnimeController(MiAnimeService miAnimeService) {
        this.miAnimeService = miAnimeService;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> all() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GenericResponse(miAnimeService.ListarMisAnimes()));
    }

}
//    @PostMapping
//    public ResponseEntity<GenericResponse> addAnimeToMyAnimes(MiAnime miAnime) {
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(new GenericResponse(miAnimeService.addToMyAnimes(miAnime)));




