package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String []args){
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("Hasilnya adalah = "+ hasil);
        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = "+ hsl);
        float pf = 3.21f;
        float lf = 2.76f;
        float hasilf = hitungLuas(pf, lf);
        System.out.println("Hasilnya adalah = "+ hasilf);
    }

    public  static  double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }

    public  static  int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }

    public  static  float hitungLuas(float panjang, float lebar){
        float luas = panjang * lebar;
        return luas;
    }

}
