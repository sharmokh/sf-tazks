package com.tazks.app.services;

import com.tazks.app.model.Client;
import com.tazks.app.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;

    @Autowired
    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    public Set<Client> findAll() {
        Set<Client> clients = new HashSet<>();
        repository.findAll().forEach(clients::add);
        return clients;
    }

    public Client findByID(UUID id) {
        return repository.findById(id)
                         .orElse(null);
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public void delete(Client client) {
        repository.delete(client);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
