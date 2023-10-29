package com.arch.hexagonal.application.core.usecase;

import com.arch.hexagonal.application.core.domain.Address;
import com.arch.hexagonal.application.core.domain.Customer;
import com.arch.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.arch.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.arch.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase {
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;


    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        Address address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
