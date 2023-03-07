package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[]args){

        //Cara 1
        int[] arrInt1= new int[]{1,2,3,4,5,6};

        System.out.println(arrInt1[0]);
        System.out.println(arrInt1[1]);
        System.out.println(arrInt1[2]);
        System.out.println(arrInt1[3]);
        System.out.println(arrInt1[4]);
        System.out.println(arrInt1[5]);
        System.out.println();

        //Cara 2
        int[] arrInt2 = new int [15];
        arrInt2[0] = 1;
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        arrInt2[5] = 6;

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);
        System.out.println();

        //Cara 3 (tanpa new)
        int[] arrInt3 = {1,2,3,4,5,6};

        System.out.println(arrInt3[0]);
        System.out.println(arrInt3[1]);
        System.out.println(arrInt3[2]);
        System.out.println(arrInt3[3]);
        System.out.println(arrInt3[4]);
        System.out.println(arrInt3[5]);
        System.out.println();
    }
}
