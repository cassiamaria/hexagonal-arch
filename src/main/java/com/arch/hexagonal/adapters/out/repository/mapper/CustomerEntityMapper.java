package com.arch.hexagonal.adapters.out.repository.mapper;

import com.arch.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.arch.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toEntity(Customer customer);
    Customer toCustomer (CustomerEntity customerEntity);
}
