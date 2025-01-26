package com.careerit.day4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        /*accept the income and return the tax amount
        0-3,50,000 -> 0%
        3,50,001 - 5,00,000 -> 5%
        5,00,001 - 10,00,000 -> 10%
        10,00,001 - 20,00,000 -> 20%
        20,00,001 - 50,00,000 -> 30%
        50,00,001 - above -> 40%
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income amount");
        double income = sc.nextDouble();
        double tax = calculateTax(income);
        System.out.println("income is " + income + " tax is " + tax);
    }

    private static double calculateTax(double income) {
        double tax = 0;
        if (income <= 350000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 350000) * 0.05;
        } else if (income <= 1000000) {
            tax = (income - 500000) * 0.1 + 7500;
        } else if (income <= 2000000) {
            tax = (income - 1000000) * 0.2 + 7500 + 50000;
        } else if (income <= 5000000) {
            tax = (income - 2000000) * 0.3 + 7500 + 50000 + 200000;
        } else {
            tax = (income - 5000000) * 0.4 + 7500 + 50000 + 200000 + 900000;
        }
        return tax;
    }
}
