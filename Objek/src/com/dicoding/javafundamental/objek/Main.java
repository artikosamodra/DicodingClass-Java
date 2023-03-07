package com.dicoding.javafundamental.objek;

public class Main {
    public static void main(String[]args){

        //Hewan objekHewan = new Hewan();
        //objekHewan.cetakNama("Elang");

        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
