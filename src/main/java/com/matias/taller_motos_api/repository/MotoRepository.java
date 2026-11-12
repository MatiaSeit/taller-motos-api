package com.matias.taller_motos_api.repository;

import com.matias.taller_motos_api.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, String> {
}
