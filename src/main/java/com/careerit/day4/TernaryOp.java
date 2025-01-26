package com.careerit.day4;

import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1 and num2");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int big = num1 > num2 ? num1 : num2; //ternary operator
            System.out.println(big);
    }
}
