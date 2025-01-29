package com.careerit.day6;

public class PatternPrint2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
        };
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                int val =array[i][j];
                if(val == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
