package com.devlabs.sfgpetclinic.repositories;

import com.devlabs.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
