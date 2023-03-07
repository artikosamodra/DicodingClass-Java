package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[]args){
        int[] arrInt = new  int[]{1,2,3,4,5, /*...,*/ 999998, 999999, 1000000};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);

        /*...*/

        //System.out.println(arrInt[999998]);
        //System.out.println(arrInt[999999]);
        //System.out.println();

        int[]arrInt1 = new int[1000000];

        //Inisiasi dan menampilkan arrInt1 dari elemen 1 sampai 1.000.000

        for(int x = 0; x < arrInt1.length; x++){
            arrInt1[x] = x + 1;
            System.out.println(arrInt1[x]);
        }
    }
}
