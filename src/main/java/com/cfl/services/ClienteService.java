package com.cfl.services;

import com.cfl.model.Cliente;
import com.cfl.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteRepository repository;

    public List<Cliente> listarClientes() {
        return repository.listAll();
    }
}
