package com.tazks.app.repositories;

import com.tazks.app.model.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRespository extends CrudRepository<Job, Long> {
}
