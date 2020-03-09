package my.clinic.myclinic.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "vets")
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities" , joinColumns=JoinColumn(name="vet_id"), inverseJoinColumns = JoinColumn(name="specialty_id"))
    private Set<Specialty>  specialities = new HashSet<>();


}
