package com.tazks.app.services;

import com.tazks.app.model.Client;
import com.tazks.app.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;

    @Autowired
    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client findById(Long id) {
        return repository.findById(id)
                         .orElse(null);
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public void delete(Client client) {
        repository.delete(client);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
