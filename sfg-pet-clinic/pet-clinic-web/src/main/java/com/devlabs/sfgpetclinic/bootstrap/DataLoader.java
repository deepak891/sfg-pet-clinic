package com.devlabs.sfgpetclinic.bootstrap;

import com.devlabs.sfgpetclinic.model.Owner;
import com.devlabs.sfgpetclinic.model.Pet;
import com.devlabs.sfgpetclinic.model.PetType;
import com.devlabs.sfgpetclinic.model.Vet;
import com.devlabs.sfgpetclinic.service.OwnerService;
import com.devlabs.sfgpetclinic.service.PetTypeService;
import com.devlabs.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Deepak");
        owner1.setLastName("Bhagat");
        owner1.setAddress("Singhmore ");
        owner1.setCity("Ranchi");
        owner1.setTelephone("44444442134");

        Pet deepakPet = new Pet();
        deepakPet.setPetType(savedDogPetType);
        deepakPet.setOwner(owner1);
        deepakPet.setBirthDate(LocalDate.now());
        deepakPet.setName("Kalu");
        owner1.getPets().add(deepakPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nimmi");
        owner2.setLastName("Bhagat");
        owner2.setAddress("B-102, Shruti Subham");
        owner2.setCity("Hatia");
        owner2.setTelephone("33333");

        Pet nimmiPet = new Pet();
        deepakPet.setPetType(savedCatPetType);
        deepakPet.setOwner(owner2);
        deepakPet.setBirthDate(LocalDate.now());
        deepakPet.setName("Juat Cat");
        owner1.getPets().add(nimmiPet);
        ownerService.save(owner2);

        System.out.println("Loaded Owner...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Tommy");
        vet1.setLastName("Tommy");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Piku");
        vet2.setLastName("piku");
        vetService.save(vet2);

        System.out.println("Loaded Vets ....");

    }
}
