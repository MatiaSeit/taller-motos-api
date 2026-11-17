package com.matias.taller_motos_api.repository;

import com.matias.taller_motos_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
