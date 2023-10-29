package com.arch.hexagonal.config;

import com.arch.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arch.hexagonal.adapters.out.InsertCustomerAdapter;
import com.arch.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.arch.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}