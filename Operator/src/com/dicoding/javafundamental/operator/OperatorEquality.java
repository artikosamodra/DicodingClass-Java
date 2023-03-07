package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args){

        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan...");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari...");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar sama dengan...");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari...");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari sama dengan...");
        result = value <= anotherValue;
        System.out.println("Hasil 'value <= anotherValue' adalah " + result);
        System.out.println();

    }
}
