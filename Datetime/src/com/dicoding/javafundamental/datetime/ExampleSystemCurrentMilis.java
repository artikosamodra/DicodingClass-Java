package com.dicoding.javafundamental.datetime;

public class ExampleSystemCurrentMilis {
    public static void main (String []args){
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalam " + timeNow + "milisecond");
    }
}
