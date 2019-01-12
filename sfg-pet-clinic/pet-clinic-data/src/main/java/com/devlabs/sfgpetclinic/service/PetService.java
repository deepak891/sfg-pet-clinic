package com.devlabs.sfgpetclinic.service;

import com.devlabs.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
