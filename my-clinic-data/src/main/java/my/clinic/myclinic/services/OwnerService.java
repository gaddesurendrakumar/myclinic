package my.clinic.myclinic.services;

import my.clinic.myclinic.domain.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
