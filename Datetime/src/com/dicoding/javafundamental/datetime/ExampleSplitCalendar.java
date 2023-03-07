package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[]args){
        //getTime = menampilakn waktu sekarang secara keseluruhan
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        //menampilkan waktu pilihan atau yg dibutuhkan untuk ditampilkan

        //get(var.DATE) = menampilkan tanggal dalam bentuk angka
        System.out.println("Tanggal : "+calendar.get(Calendar.DATE));

        //get(var.MONTH) = menampilkan bulan dalam bentuk angka
        System.out.println("Bulan : "+calendar.get(Calendar.MONTH));
        //bulan dimulai dari 0, jadi januari adalah bulan 0

        //get(var.YEAR) = menampilkan tahun dalam bentuk angka
        System.out.println("Tahun : "+calendar.get(Calendar.YEAR));
    }
}
