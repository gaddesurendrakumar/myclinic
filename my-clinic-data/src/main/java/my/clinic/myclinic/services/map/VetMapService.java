package my.clinic.myclinic.services.map;

import my.clinic.myclinic.domain.Vet;
import my.clinic.myclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {

@Override
public Vet findById(Long id) {
        return super.findById(id);
        }

@Override
public Vet save(Vet object) {
        return super.save(object.getId(),object);
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
