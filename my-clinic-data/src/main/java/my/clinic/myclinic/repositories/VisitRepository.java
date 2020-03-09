package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
