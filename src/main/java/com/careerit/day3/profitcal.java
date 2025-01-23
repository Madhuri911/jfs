package com.careerit.day3;

import java.util.Scanner;

public class profitcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sp");
        double sp = sc.nextDouble();
        System.out.println("enter cp");
        double cp = sc.nextDouble();
        if (sp > cp) {
            double profit = sp - cp;
            System.out.println(+profit);
        } else if (sp < cp) {
            double loss = cp - sp;
            System.out.println(+loss);
        } else {
            System.out.println("no profit");
        }
    }
}
