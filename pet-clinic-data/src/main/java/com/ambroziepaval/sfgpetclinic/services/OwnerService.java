package com.ambroziepaval.sfgpetclinic.services;

import com.ambroziepaval.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Ambrozie on 08/10/2018
 */
public interface OwnerService {

    Owner findBylastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
