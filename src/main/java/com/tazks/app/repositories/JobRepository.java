package com.tazks.app.repositories;

import com.tazks.app.model.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface JobRepository extends CrudRepository<Job, UUID> {
}
