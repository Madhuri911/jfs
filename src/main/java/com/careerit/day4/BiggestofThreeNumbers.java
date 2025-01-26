package com.careerit.day4;

public class BiggestofThreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int big = biggest(10, 20,30);
        System.out.println(+big);
    }
    public static int biggest(int a, int b, int c){
        int big;
        if (a >b && a>c){
            big = a;
        }else if (b>c){
            big = b;
        }else{
            big = c;
        }
        return big;
    }
}
