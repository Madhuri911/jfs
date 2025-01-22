package com.careerit.day2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double p = 10000;
        double r = 3.5f;
        double t = 3;
        double S = (p * t * r) / 100;
        double amount = p + S;
        System.out.println(S);
        System.out.println(amount);

    }
}
