package my.clinic.myclinic.services;

import my.clinic.myclinic.domain.Owner;



public interface OwnerService extends CrudService<Owner,Long>{
   public Owner findByLastName(String lastName);

}
