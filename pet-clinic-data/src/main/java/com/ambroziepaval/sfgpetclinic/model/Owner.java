package com.ambroziepaval.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Ambrozie on 07/10/2018
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
