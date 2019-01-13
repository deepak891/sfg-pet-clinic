package com.devlabs.sfgpetclinic.service;

import com.devlabs.sfgpetclinic.model.Owner;

public interface OwnerService extends CurdService<Owner, Long>{

    Owner findByLastName(String lastName);

}
