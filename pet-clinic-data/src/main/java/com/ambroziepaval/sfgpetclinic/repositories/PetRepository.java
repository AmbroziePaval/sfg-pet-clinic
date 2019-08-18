package com.ambroziepaval.sfgpetclinic.repositories;

import com.ambroziepaval.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
