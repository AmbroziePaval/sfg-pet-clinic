package com.ambroziepaval.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Ambrozie on 07/10/2018
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
