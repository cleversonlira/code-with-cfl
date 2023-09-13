package com.cfl.resources;

import com.cfl.model.Cliente;
import com.cfl.services.ClienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/clientes")
public class ClienteResource {


    @Inject ClienteService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> listarClientes() {
        return service.listarClientes();
    }
}
