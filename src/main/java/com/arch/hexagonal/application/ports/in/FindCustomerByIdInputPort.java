package com.arch.hexagonal.application.ports.in;

import com.arch.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
