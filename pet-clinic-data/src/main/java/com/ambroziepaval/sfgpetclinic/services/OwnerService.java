package com.ambroziepaval.sfgpetclinic.services;

import com.ambroziepaval.sfgpetclinic.model.Owner;

import java.util.List;
import java.util.Set;

/**
 * Created by Ambrozie on 08/10/2018
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
