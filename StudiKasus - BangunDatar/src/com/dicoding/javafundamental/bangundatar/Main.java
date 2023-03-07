package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    //metode mainmenu inout
    private static char pilihan;
    private  static Scanner scanner = new Scanner(System.in);
    public  static void main (String []args){

        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        //panggil method
        mainMenu();

        //kodisional untuk akses menu
        switch (pilihan){
            case '1':{
                System.out.print("Masukkan panjang persegi : ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi : ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang : "+opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang : "+opersegi.keliling(s1,s2));
                break;
            }

            case '2':{
                System.out.print("Masukkan alas segitiga siku : ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi segitiga siku : ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga siku : "+osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga siku : "+osegitiga.keliling(s1,s2));
                break;
            }

            case '3':{
                System.out.print("Masukkan jari-jari lingkaran : ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran : "+olingkaran.luas(r));
                System.out.println("Keliling lingkaran : "+olingkaran.keliling(r));
                break;
            }
            default:{
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    //pengaturan mainmenu
    private static void mainMenu(){
        //pilihan menu
        System.out.println("=================");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);


    }
}
