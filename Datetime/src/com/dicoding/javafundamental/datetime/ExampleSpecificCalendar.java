package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main (String[]args){

        //menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah "+calendar.getTime());

        //Menampilkan 15 haru yg lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: "+calendar.getTime());

        //Menampilkan 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: "+calendar.getTime());

        //Menampilkan 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian: "+calendar.getTime());
    }
}
