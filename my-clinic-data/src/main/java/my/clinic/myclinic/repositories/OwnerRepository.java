package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
