package org.example;

import org.example.config.PaymentConfig;
import org.example.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PaymentConfig.class);
        PaymentService paymentService = applicationContext.getBean("paymentService", PaymentService.class);
        paymentService.makePayment();
    }
}