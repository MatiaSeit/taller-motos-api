package com.matias.taller_motos_api.service;

import com.matias.taller_motos_api.model.Cliente;
import com.matias.taller_motos_api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public boolean borrar(Long id) {
        Cliente cliente = buscarPorId(id);
        if (cliente == null) {
            return false;
        }
        clienteRepository.delete(cliente);
        return true;
    }

    public Cliente crear(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}