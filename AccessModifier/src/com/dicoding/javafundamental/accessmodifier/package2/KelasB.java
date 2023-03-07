package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {
    //kelas B merupakan turunan dari kelas A menggunakan perintah extends

    @Override
    protected void methodC(){
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
