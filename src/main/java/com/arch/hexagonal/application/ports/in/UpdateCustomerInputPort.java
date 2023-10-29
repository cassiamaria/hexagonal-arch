package com.arch.hexagonal.application.ports.in;

import com.arch.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
