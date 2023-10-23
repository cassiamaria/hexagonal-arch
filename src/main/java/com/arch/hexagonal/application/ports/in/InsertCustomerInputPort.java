package com.arch.hexagonal.application.ports.in;

import com.arch.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort   {
    void insert(Customer customer, String zipCode);
}
