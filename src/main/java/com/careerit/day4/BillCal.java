package com.careerit.day4;

import java.util.Scanner;

public class BillCal {
    //cal bill amount; if the bill amount > 1000, give 10%, if they have membership, give extra 10% or 5%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bill amount");
        double amount = sc.nextDouble();
        System.out.println("enter premium or regular");
        String type = sc.next();
        double discount = 0;
        if (type.equals("p") || amount >= 1000) {
            discount = amount * 0.1;
        } else {
            discount = amount * 0.05;
        }
        System.out.println("discount" + discount);
    }
}
