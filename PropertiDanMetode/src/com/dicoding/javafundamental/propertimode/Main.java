package com.dicoding.javafundamental.propertimode;

public class Main {
    public static void main(String[]args){
        //tambahkan 1 argumen dengan nilai int 2
        //nilai digunakan untuk inisiasi variable umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        //contoh fungsi getumur
        System.out.println("Umur adalah "+kucing.getUmur());

        //perhitungan indeks massa tubuh(BMI);
        double bmi = kucing.getBerat()/((kucing.getTinggi()*0.01) * (kucing.getTinggi()*0.01));
        System.out.println("Indeks massa tubuhnya adalah "+bmi);

    }
}
