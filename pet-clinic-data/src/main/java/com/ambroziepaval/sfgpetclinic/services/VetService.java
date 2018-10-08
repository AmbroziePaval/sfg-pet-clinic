package com.ambroziepaval.sfgpetclinic.services;

import com.ambroziepaval.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ambrozie on 08/10/2018
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
