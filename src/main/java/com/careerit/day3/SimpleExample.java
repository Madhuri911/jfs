package com.careerit.day3;

import java.util.Scanner;

public class SimpleExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        if(age<0)
        {
            age = Math.abs(age);
        }
        System.out.println(+age);
    }
}
