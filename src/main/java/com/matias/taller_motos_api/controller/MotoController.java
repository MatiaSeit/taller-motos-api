package com.matias.taller_motos_api.controller;

import com.matias.taller_motos_api.model.Moto;
import com.matias.taller_motos_api.service.MotoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotoController {

    private final MotoService motoService;

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    @GetMapping
    public List<Moto> listar() {
        return motoService.listar();
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Moto> buscarPorMatricula(@PathVariable String matricula) {
        Moto moto = motoService.buscarPorMatricula(matricula);
        if (moto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(moto);
    }

    @PostMapping
    public ResponseEntity<Moto> crear(@RequestBody Moto moto) {
        Moto motoCreada = motoService.crear(moto);
        return ResponseEntity.status(HttpStatus.CREATED).body(motoCreada);
    }
}