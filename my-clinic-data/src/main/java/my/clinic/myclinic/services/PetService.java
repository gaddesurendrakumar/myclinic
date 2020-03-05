package my.clinic.myclinic.services;


import my.clinic.myclinic.domain.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
