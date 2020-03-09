package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Specialty,Long> {
}
