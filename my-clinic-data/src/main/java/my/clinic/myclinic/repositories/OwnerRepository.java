package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String name);
    List<Owner> findAllByLastNameLike(String lastName);
}
