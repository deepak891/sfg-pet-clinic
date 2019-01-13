package com.devlabs.sfgpetclinic.bootstrap;

import com.devlabs.sfgpetclinic.model.Owner;
import com.devlabs.sfgpetclinic.model.Vet;
import com.devlabs.sfgpetclinic.service.OwnerService;
import com.devlabs.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(100L);
        owner1.setFirstName("Deepak");
        owner1.setLastName("Bhagat");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(101L);
        owner2.setFirstName("Nimmi");
        owner2.setLastName("Bhagat");
        ownerService.save(owner2);

        System.out.println("Loaded Owner...");

        Vet vet1 = new Vet();
        vet1.setId(200L);
        vet1.setFirstName("Tommy");
        vet1.setLastName("Tommy");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(200L);
        vet2.setFirstName("Piku");
        vet2.setLastName("piku");
        vetService.save(vet2);

        System.out.println("Loaded Vets ....");

    }
}
