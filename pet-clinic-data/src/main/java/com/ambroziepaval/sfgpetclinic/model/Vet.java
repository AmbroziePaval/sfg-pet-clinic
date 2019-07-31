package com.ambroziepaval.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ambrozie on 07/10/2018
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
