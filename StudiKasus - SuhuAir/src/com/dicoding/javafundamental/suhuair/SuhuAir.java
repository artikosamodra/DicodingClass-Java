package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[]args){

        int T;

       System.out.println("Contoh IF tiga kasus");

       System.out.print("Suhu derajat (C) = ");
       //Input suhu
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        //if tiga kasus
        if (T < 0){
         System.out.println("Wujud beku");
        } else if ((0 <= T) && (T <= 100)){
            System.out.println("Wujud Cair");
        } else if (T > 100){
            System.out.println("Wujud Gas");
        }
    }
}
