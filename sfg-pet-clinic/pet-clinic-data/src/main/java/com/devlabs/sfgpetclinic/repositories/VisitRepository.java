package com.devlabs.sfgpetclinic.repositories;

import com.devlabs.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
