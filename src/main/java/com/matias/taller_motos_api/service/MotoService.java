package com.matias.taller_motos_api.service;

import com.matias.taller_motos_api.model.Moto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotoService {
    private final List<Moto> motos = new ArrayList<>(List.of(
            new Moto("ABC123", "Honda", "CBR500R", 2020, 500, "Rojo"),
            new Moto("DEF456", "Yamaha", "MT-07", 2021, 689, "Negro")
    ));

    public List<Moto> listar() {
        return motos;
    }

    public Moto buscarPorMatricula(String matricula) {
        for (Moto moto : listar()) {
            if (moto.getMatricula().equals(matricula)) {
                return moto;
            }
        }
            return null;
        }

    public Moto crear(Moto moto) {
        if (buscarPorMatricula(moto.getMatricula()) != null) {
            return null;
        }
        motos.add(moto);
        return moto;
    }

    public boolean borrar(String matricula){
        Moto moto = buscarPorMatricula(matricula);
        if (moto == null) {
            return false;
        }
        motos.remove(moto);
        return true;
    }
}