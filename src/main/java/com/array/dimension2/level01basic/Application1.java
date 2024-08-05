package com.array.dimension2.level01basic;

public class Application1 {
    public static void main(String[] args) {
        int[][] iarr = new int[3][4];

        int su = 1;
        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = su++;
            }
        }

        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
