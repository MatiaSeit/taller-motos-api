package com.matias.taller_motos_api.repository;

import com.matias.taller_motos_api.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotoRepository extends JpaRepository<Moto, String> {

    List<Moto> findByMarca(String marca);

}
