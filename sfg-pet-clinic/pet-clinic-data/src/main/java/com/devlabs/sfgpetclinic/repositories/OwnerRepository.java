package com.devlabs.sfgpetclinic.repositories;

import com.devlabs.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
