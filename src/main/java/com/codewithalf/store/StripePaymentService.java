package com.codewithalf.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Logic to process payment using Stripe API
        System.out.println("STRIPE" );
        System.out.println("Amount: " + amount);
    }
}
