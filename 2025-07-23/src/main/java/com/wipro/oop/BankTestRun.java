package com.wipro.oop;

public class BankTestRun {
    public static void main(String[] args) {
        AxisBank axisAcc = new AxisBank("AXIS456");
        ZenithBank zenithAcc = new ZenithBank("ZEN123");

        axisAcc.deposit(4500, "AXIS456");
        System.out.println("AxisBank balance: ₹" + axisAcc.checkBalance("AXIS456"));

        zenithAcc.deposit(7000, "ZEN123");
        System.out.println("ZenithBank balance: ₹" + zenithAcc.checkBalance("ZEN123"));
    }
}
