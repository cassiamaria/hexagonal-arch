package com.arch.hexagonal.application.ports.out;

import com.arch.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort  {

    void insert(Customer customer);
}
