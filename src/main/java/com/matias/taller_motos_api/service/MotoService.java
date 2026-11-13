package com.matias.taller_motos_api.service;

import com.matias.taller_motos_api.model.Moto;
import com.matias.taller_motos_api.repository.MotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {
    private final MotoRepository motoRepository;

    public MotoService(MotoRepository motoRepository) {
        this.motoRepository = motoRepository;
    }

    public List<Moto> listar() {
        return motoRepository.findAll();
    }

    public Moto buscarPorMatricula(String matricula) {
        return motoRepository.findById(matricula).orElse(null);
        }

    public List<Moto> buscarPorMarca(String marca) {
        return motoRepository.findByMarca(marca);
    }

    public Moto crear(Moto moto) {
        if (buscarPorMatricula(moto.getMatricula()) != null) {
            return null;
        }
        return motoRepository.save(moto);
    }

    public boolean borrar(String matricula){
        Moto moto = buscarPorMatricula(matricula);
        if (moto == null) {
            return false;
        }
        motoRepository.delete(moto);
        return true;
    }
}