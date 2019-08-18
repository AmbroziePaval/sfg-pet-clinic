package com.ambroziepaval.sfgpetclinic.repositories;

import com.ambroziepaval.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
