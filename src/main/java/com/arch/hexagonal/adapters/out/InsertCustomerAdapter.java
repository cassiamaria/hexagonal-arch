package com.arch.hexagonal.adapters.out;

import com.arch.hexagonal.adapters.out.repository.CustomerRepository;
import com.arch.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.arch.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.arch.hexagonal.application.core.domain.Customer;
import com.arch.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toEntity(customer);
        customerRepository.save(customerEntity);
    }
}
