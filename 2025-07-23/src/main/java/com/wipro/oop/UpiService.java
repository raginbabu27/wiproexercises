package com.wipro.oop;

public class UpiService implements PaymentOption {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI service.");
    }
}
