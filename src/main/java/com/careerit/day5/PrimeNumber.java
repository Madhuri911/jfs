package com.careerit.day5;
public class PrimeNumber {
    public static void main(String[] args) {
        int lb= 1;
        int ub = 10;
        int count = countPrimes(lb,ub);
        System.out.println(count);
        System.out.println("prime numbers in the range");
        showPrimes(lb,ub);
        System.out.println("\nThe first 10 prime numbers are");
        showNPrimes(10);
    }
 public static int countPrimes(int lb, int ub){
      int count = 0;
      for(int i =lb; i<=ub; i++){
          if(isPrime(i)){
              count++;
          }
      }
      return count;
 }

 public static void showPrimes(int lb, int ub){
     for(int i=lb;i<=ub;i++){
         if(isPrime(i)){
             System.out.println(i+"");
         }
     }
 }
 public static void showNPrimes(int N){
        int count =0;
        for(int i=2; ;i++){
            if(isPrime(i)){
                System.out.println(i+"");
                count++;
            }
            if(count == N){
                break;
            }
        }
 }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0 && num != 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
