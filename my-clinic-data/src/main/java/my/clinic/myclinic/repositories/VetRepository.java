package my.clinic.myclinic.repositories;

import my.clinic.myclinic.domain.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
