package com.dicoding.javafundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[]args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //bulan bisa MM atau M (2 angka/1 angka) namun harus M kapital
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : "+ new Date());
        System.out.println("Format tanggal dengan format : "+ dateFormated);
    }
}
