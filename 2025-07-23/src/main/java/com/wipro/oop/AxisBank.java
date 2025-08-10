package com.wipro.oop;

public class AxisBank implements BankOperations {
    private String accountId;
    private double currentBalance;

    public AxisBank(String accountId) {
        this.accountId = accountId;
        this.currentBalance = 0.0;
    }

    @Override
    public void deposit(double amount, String accountId) {
        if(this.accountId.equals(accountId)) {
            currentBalance += amount;
            System.out.println("AxisBank: ₹" + amount + " deposited to " + accountId);
        } else {
            System.out.println("AxisBank: Invalid account ID.");
        }
    }

    @Override
    public double checkBalance(String accountId) {
        if(this.accountId.equals(accountId)) {
            return currentBalance;
        } else {
            System.out.println("AxisBank: Invalid account ID.");
            return -1;
        }
    }
}
