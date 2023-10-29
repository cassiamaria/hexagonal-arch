package com.arch.hexagonal.adapters.out;

import com.arch.hexagonal.adapters.out.repository.CustomerRepository;
import com.arch.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.arch.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.arch.hexagonal.application.core.domain.Customer;
import com.arch.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toEntity(customer);
        repository.save(customerEntity);
    }
}
