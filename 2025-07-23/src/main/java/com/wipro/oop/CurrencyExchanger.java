package com.wipro.oop;

public class CurrencyExchanger {

    public static int convertToINR(int usd) throws NumberFormatException {
        if (usd == 0) {
            throw new NumberFormatException("Amount cannot be zero");
        }
        return usd * 82;
    }

    public static void main(String[] args) {
        try {
            int convertedAmount = convertToINR(15);
            System.out.println("Converted amount: ₹" + convertedAmount);
        } catch (NumberFormatException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
