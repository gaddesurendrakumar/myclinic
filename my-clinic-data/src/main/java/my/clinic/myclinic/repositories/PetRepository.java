package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
