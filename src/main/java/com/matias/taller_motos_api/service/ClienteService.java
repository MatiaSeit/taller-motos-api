package com.matias.taller_motos_api.service;

import com.matias.taller_motos_api.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    public List<Cliente> listar() {
        return List.of(
                new Cliente(1L, "Laura", "600123123", "laura@mail.com"),
                new Cliente(2L, "Juan", "600456456", "juan@mail.com")
        );
    }

    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : listar()) {
            if (cliente.getId().equals(id)) {
                return cliente;
        }
        }
        return null;
    }
}
