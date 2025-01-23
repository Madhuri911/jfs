package com.careerit.day3;

import java.util.Scanner;

public class DiscountCal {
    //accept the bill amount and cal the discount amount if the bill amount > 1000 then 10% discount otherwise no discount
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bill amount");
        double billAmount = sc.nextDouble();
        double discount = 0;
        if (billAmount > 1000) {
            discount = billAmount * 0.1;
        }
        double netAmount = billAmount - discount;
        System.out.println("billAmount:" + billAmount);
        System.out.println("discount:" + discount);
        System.out.println("netAmount:" + netAmount);
    }
}
