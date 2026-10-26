package com.matias.taller_motos_api.service;

import com.matias.taller_motos_api.model.Moto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotoService {
    private final List<Moto> motos = new ArrayList<>(List.of(
            new Moto("ABC123", "Honda", "CBR500R", 2020,500, "Rojo"),
            new Moto("DEF456", "Yamaha", "MT-07", 2021,689, "Negro")
    ));

    public List<Moto> listar() {
        return motos;
    }
}
