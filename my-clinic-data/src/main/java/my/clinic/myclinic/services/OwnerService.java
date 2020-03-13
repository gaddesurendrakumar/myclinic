package my.clinic.myclinic.services;

import my.clinic.myclinic.domain.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner,Long>{
   public Owner findByLastName(String lastName);
   List<Owner> findAllByLastNameLike(String lastName);

}
