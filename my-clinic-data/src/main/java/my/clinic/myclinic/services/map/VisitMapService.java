package my.clinic.myclinic.services.map;

import my.clinic.myclinic.domain.Visit;
import my.clinic.myclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class VisitMapService  extends  AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() ==null || visit.getPet().getOwner() == null || visit.getPet().getId() ==null || visit.getPet().getOwner().getId() == null)
        {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
