package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
