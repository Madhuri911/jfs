package com.careerit.day3;

import java.util.Scanner;

public class SwappingofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two values");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("before swap" + num1 + " " + num2);
        int t = num1;
        num1 = num2;
        num2 = t;
        System.out.println(" swap of two numbers are:" + num1 + " " + num2);
    }
}
