package com.matias.taller_motos_api.controller;

import com.matias.taller_motos_api.model.Moto;
import com.matias.taller_motos_api.service.MotoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}