package com.careerit.day2;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 66;
        int num3 = 56;
        int max = Math.max(num1,num2);
        int result = Math.max(max,num3);
        System.out.println("Output is " + result);
    }
}
