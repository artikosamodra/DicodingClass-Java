package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main (String []args){

        try {
            //mencoba berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);

            //tampilan output jika berhasil
            System.out.println("Read file berhasil");
        } catch (Exception e){
            //Jika gagal
            System.out.println(e.getMessage());
        }
    }
}
