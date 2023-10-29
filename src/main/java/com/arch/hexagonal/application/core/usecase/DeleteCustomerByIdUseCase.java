package com.arch.hexagonal.application.core.usecase;

import com.arch.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.arch.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase {
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdInputPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            DeleteCustomerByIdOutputPort deleteCustomerByIdInputPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdInputPort = deleteCustomerByIdInputPort;
    }
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdInputPort.delete(id);
    }
}
