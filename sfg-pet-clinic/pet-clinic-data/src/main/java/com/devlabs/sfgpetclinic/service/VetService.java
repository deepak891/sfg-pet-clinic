package com.devlabs.sfgpetclinic.service;

import com.devlabs.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
