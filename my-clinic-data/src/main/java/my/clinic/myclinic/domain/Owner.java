package my.clinic.myclinic.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@Entity
@Table(name = "ownners")
public class Owner extends  Person {
    public Owner() {
    }

    @Builder
    public Owner(String address, String city, String telephone, Set<Pet> pets) {
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
    @Builder
    public Owner(String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column (name = "telephone")
    private String telephone;
    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

}
