package org.example.config;

import org.example.services.PaymentService;
import org.example.services.servicesImpl.PaymentServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.services", "org.example.aspect"})
@EnableAspectJAutoProxy
public class PaymentConfig {

    @Bean
    public PaymentService paymentService() {
        return new PaymentServiceImplementation();
    }
}
