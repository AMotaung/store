package com.codewithalf.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Logic to process payment using PayPal API
        System.out.println("PAYPAL" );
        System.out.println("Amount: " + amount);
    }
    
}
