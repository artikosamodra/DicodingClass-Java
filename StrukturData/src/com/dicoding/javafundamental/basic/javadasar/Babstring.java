package com.dicoding.javafundamental.basic.javadasar;

public class Babstring {
    public static void string(){
        //Penulisan data string
        java.lang.String greeting = "Hello World";
        System.out.println((greeting));

        //Array dengan String
        char[] dicodingChars = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
        java.lang.String dicodingString = new java.lang.String(dicodingChars);
        System.out.println(dicodingString);

        //Panjang jumlah char *length() = jumlah karakter
        java.lang.String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);

        //Menambil nilai urutan char *charArt(int index) = menampilkan index ke-n
        String dicodingx = "dicoding";
        char result = dicodingx.charAt(0);
        System.out.println(result);
    }
}
