package com.arch.hexagonal.config;

import com.arch.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arch.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.arch.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.arch.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}