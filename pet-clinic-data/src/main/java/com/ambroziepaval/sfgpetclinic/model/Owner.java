package com.ambroziepaval.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Ambrozie on 07/10/2018
 */
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;
}
