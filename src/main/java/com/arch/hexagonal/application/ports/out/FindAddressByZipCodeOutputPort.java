package com.arch.hexagonal.application.ports.out;

import com.arch.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
