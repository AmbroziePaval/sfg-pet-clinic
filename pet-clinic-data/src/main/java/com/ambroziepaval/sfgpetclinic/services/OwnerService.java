package com.ambroziepaval.sfgpetclinic.services;

import com.ambroziepaval.sfgpetclinic.model.Owner;

/**
 * Created by Ambrozie on 08/10/2018
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
