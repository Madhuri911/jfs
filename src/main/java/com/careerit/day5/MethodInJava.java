package com.careerit.day5;

import java.time.LocalDate;

public class MethodInJava {
    public static void main(String[] args) {
        showSystemInfo();
        showGreetings("Madhu");
        System.out.println(factorial(5));
        System.out.println("today is "+getSystemDate());
    }

    //Method with no arguments and no return type
    public static void showSystemInfo(){
        System.out.println("OS Name:"+System.getProperty("os.name"));
    }

    //Method with arguments and no return type
     public static void showGreetings(String name){
         System.out.println("Hello " +name);
     }

     //Method with arguments and return type
    public static int factorial(int num){
        int r = 1;
        for(int i=2;i<=num;i++){
            r *=i;
        }
        return r;
    }

    //Method with no arguments and return type
    public static LocalDate getSystemDate(){
        return LocalDate.now();
    }
}

