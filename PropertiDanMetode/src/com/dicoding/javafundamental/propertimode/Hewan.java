package com.dicoding.javafundamental.propertimode;

public class Hewan {

    //properti
    double tinggi = 30;
    double berat = 3;

    //inisiasi konstruktor
    int umur;

    //konstruktor parameter
    //Hewan(int umurParam){
    //   umur = umurParam;
    // }

    //menggunakan this ataupun variable baru hasilnya sama
    Hewan(int umur){
        this.umur = umur;
    }

    void  lari(){
        System.out.println("Berlari dengan sangat cepat...");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    int getUmur(){
        return umur;
    }
}
