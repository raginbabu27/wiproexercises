package com.wipro.oop;

public class PaymentTestRun {
    public static void main(String[] args) {
        PaymentOption paymentMethod = new UpiService();
        paymentMethod.processPayment(750.0);
    }
}
