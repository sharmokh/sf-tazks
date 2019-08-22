package com.tazks.app.repositories;

import com.tazks.app.model.Handyman;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface HandymanRepository extends CrudRepository<Handyman, UUID> {

    Handyman findByLastName(String lastName);
    List<Handyman> findByLastNameLikeIgnoreCase(String lastName);

}
