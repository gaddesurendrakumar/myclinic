package my.clinic.myclinic.services.map;

import my.clinic.myclinic.domain.PetType;
import my.clinic.myclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
