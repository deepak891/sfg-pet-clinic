package com.devlabs.sfgpetclinic.repositories;

import com.devlabs.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
