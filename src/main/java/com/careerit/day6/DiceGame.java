package com.careerit.day6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        int gnum = ThreadLocalRandom.current().nextInt(1,7);
       // System.out.println("Guess number is "+gnum); //we will get the system generated dice number
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("guess the number(1-6)");
            int num = sc.nextInt();
            if(num == gnum){
                System.out.println("you won the game");
                break;
            }else{
                if(i ==3){
                    System.out.println("you lost the game and reached max number of attempts, the num is "+gnum);
                }else{
                    System.out.println("try again");
                }
            }
        }
















       /* System.out.println("Guess the number(1-6)");
        int num = sc.nextInt();
        if(gnum == num){
            System.out.println("you won the game");
        }else{
            System.out.println("you lose the game, the number is:"+ gnum);
        }*/
    }
}
