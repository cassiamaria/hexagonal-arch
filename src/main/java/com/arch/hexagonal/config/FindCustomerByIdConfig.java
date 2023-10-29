package com.arch.hexagonal.config;

import com.arch.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.arch.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class FindCustomerByIdConfig {
    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}