package com.wipro.oop;

public interface BankOperations {
    void deposit(double amount, String accountId);
    double checkBalance(String accountId);
}
