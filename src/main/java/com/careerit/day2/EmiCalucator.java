package com.careerit.day2;

import java.util.Scanner;

public class EmiCalucator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal value:");
        double P = sc.nextDouble();

        System.out.println("enter the rate of interest:");
        double ri = sc.nextDouble();

        System.out.println("enter the duration in months");
        double n = sc.nextDouble();

        double r = ri / 12 / 100; // ri is rate of interest
        double emi = P * r * (Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1)); 

        double totalAmount = emi * n;
        double totalInterest = totalAmount - P;
        System.out.println("Principal Amount:" + P);
        System.out.println("Rate of interest:" + ri + "%");
        System.out.println("duration" + n);
        System.out.println("EMI amount:" + emi);
        System.out.println("total interest:" + totalInterest);
        System.out.println("total amount:" + totalAmount);
    }
}
