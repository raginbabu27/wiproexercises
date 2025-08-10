package com.wipro.oop;

public class ZenithBank implements BankOperations {
    private String accountId;
    private double balance;

    public ZenithBank(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount, String accountId) {
        if(this.accountId.equals(accountId)) {
            double cashback = amount * 0.005;
            System.out.println("ZenithBank: ₹" + amount + " deposited to " + accountId);
        } else {
            System.out.println("ZenithBank: Invalid account ID.");
        }
    }

    @Override
    public double checkBalance(String accountId) {
        if(this.accountId.equals(accountId)) {
            return balance;
        } else {
            System.out.println("ZenithBank: Invalid account ID.");
            return -1;
        }
    }
}
