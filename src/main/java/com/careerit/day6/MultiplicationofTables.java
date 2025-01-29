package com.careerit.day6;

public class MultiplicationofTables {
    public static void main(String[] args) {
        int lb = 1;
        int ub = 20;
        showTable(lb, ub);
    }

    public static void showTable(int lb, int ub) {
        for (int j = lb; j <= ub; j++) {
            System.out.println("Table "+ j );
            int num = j;
            for (int i = 1; i <= 10; i++) {
                System.out.println(j * i);
            }
        }
    }
}
