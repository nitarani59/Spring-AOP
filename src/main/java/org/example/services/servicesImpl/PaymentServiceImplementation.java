package org.example.services.servicesImpl;

import org.example.services.PaymentService;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImplementation implements PaymentService {

    @Override
    public void makePayment() {
        System.out.println("Payment done");
    }
}
