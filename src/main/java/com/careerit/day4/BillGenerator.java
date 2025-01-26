package com.careerit.day4;

public class BillGenerator {
    public static void main(String[] args) {
        double billAmount = 1000;
        String day = "Monday";
        double netAmount = netAmount(billAmount, day);
        System.out.println(+netAmount);
    }

    public static double netAmount(double billAmount, String day){
        if(day.equals("Monday")||day.equals("tuesday")){
            return billAmount - billAmount * 0.3;
        }else if(day.equals("friday")){
            return billAmount - billAmount * 0.1;
        }else{
            return billAmount;
        }
    }

}
