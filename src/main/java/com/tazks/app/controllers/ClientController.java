package com.tazks.app.controllers;

import com.tazks.app.model.Client;
import com.tazks.app.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

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

    @GetMapping("/{id}/show")
    public Client getById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @PostMapping("/new")
    public String addClient(@RequestBody Client client) {
        clientService.save(client);
        return "redirect:/client/" + client.getId() + "/show";
    }

    @PutMapping("/{id}/update")
    public String updateClient(@PathVariable Long id, @RequestBody Client client) {
        client.setId(id);
        clientService.save(client);
        return "redirect:/client" + client.getId() + "/show";
    }

    @GetMapping("/{id}/delete")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteById(id);
        return "redirect:/client";
    }
}
