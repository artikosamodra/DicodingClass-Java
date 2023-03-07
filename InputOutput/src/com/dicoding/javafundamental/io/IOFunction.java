package com.dicoding.javafundamental.io;

import java.util.Scanner;

public class IOFunction {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in); //inisialisasi scanner
        System.out.println("Program penjumalahan sangat sederhana");
        System.out.println("Masukan AngkaPertama : ");
        int value = scanner.nextInt(); //fungsi menjalankan input
        System.out.println("Masukan Angka Kedua : ");
        int anotherValue = scanner.nextInt();

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah = " + result);
    }
}
