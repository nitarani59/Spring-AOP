package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect {

    @Before("execution(* org.example.services.servicesImpl.PaymentServiceImplementation.makePayment(..))")
    public void printBefore() {
        System.out.println("payment started");
    }
}
