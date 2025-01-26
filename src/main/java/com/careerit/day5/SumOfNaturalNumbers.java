package com.careerit.day5;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int N = 10;
        int sum = sumofFirstNNumbers(N);
        System.out.println(sum);

    }

    public static int sumofFirstNNumbers(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        return sum;
    }
}
