package com.ambroziepaval.sfgpetclinic.services;

import com.ambroziepaval.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ambrozie on 08/10/2018
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
