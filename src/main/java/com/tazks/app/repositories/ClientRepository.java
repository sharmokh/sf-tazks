package com.tazks.app.repositories;

import com.tazks.app.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    Optional<Client> findByLastName(String lastName);
    List<Client> findByLastNameLikeIgnoreCase(String lastName);
}
