package com.tazks.app.repositories;

import com.tazks.app.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {

    Client findByLastName(String lastName);
    List<Client> findByLastNameLikeIgnoreCase(String lastName);
}
