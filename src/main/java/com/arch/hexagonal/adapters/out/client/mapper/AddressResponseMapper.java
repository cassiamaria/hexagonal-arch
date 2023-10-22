package com.arch.hexagonal.adapters.out.client.mapper;

import com.arch.hexagonal.adapters.out.client.response.AddressResponse;
import com.arch.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
