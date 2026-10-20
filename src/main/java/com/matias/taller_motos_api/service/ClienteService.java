package com.matias.taller_motos_api.service;

import com.matias.taller_motos_api.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>(List.of(
            new Cliente(1L, "Laura", "Perez", "600123123", "laura@mail.com"),
            new Cliente(2L, "Juan", "Gomez", "600456456", "juan@mail.com")
    ));

    public List<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : listar()) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente crear(Cliente cliente) {
        cliente.setId((long) clientes.size() + 1);
        clientes.add(cliente);
        return cliente;
    }
}