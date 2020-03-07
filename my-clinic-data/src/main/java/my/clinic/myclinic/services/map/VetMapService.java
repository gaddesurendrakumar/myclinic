package my.clinic.myclinic.services.map;

import my.clinic.myclinic.domain.Specialty;
import my.clinic.myclinic.domain.Vet;
import my.clinic.myclinic.services.SpecialtyService;
import my.clinic.myclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {

        private final SpecialtyService specialtyService;

        public VetMapService(SpecialtyService specialtyService) {
                this.specialtyService = specialtyService;
        }

        @Override
public Vet findById(Long id) {
        return super.findById(id);
        }

@Override
public Vet save(Vet object) {
        if (object.getSpecialties().size() > 0){
                object.getSpecialties().forEach(speciality -> {
                        if(speciality.getId() == null){
                                Specialty savedSpecialty = specialtyService.save(speciality);
                                speciality.setId(savedSpecialty.getId());
                        }
                });
        }

        return super.save(object);
        }

@Override
public Set<Vet> findAll() {
        return super.findAll();
        }

@Override
public void deleteById(Long id) {
        super.deleteById(id);
        }

@Override
public void delete(Vet object) {
        super.delete(object);
        }
}
