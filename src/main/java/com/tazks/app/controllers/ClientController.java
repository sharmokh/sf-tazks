package com.tazks.app.controllers;

import com.tazks.app.model.Client;
import com.tazks.app.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public Set<Client> getAllClients() {
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable UUID id) {
        return clientService.findByID(id);
    }

    @PostMapping("/{id}")
    public void addClient(@RequestBody Client client) {
        clientService.save(client);
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable UUID id, @RequestBody Client client) {
        client.setId(id);
        clientService.save(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable UUID id) {
        clientService.deleteById(id);
    }
}
