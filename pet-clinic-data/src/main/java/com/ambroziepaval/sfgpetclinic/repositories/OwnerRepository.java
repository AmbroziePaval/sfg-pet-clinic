package com.ambroziepaval.sfgpetclinic.repositories;

import com.ambroziepaval.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
