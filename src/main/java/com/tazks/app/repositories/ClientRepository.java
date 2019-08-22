package com.tazks.app.repositories;

import com.tazks.app.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClientRepository extends CrudRepository<Client, UUID> {

    Client findByLastName(String lastName);
    List<Client> findByLastNameLikeIgnoreCase(String lastName);
}
