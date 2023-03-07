package com.dicoding.javafundamental.percabangan;

public class IfThenElseifThenElse {
    public static void main(String[]args){
        int nilaiUjian = 80;
        char indeksPrestasi;

        if(nilaiUjian >=90){
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70){
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60){
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50){
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }

        System.out.println("Nilai Ujian Akhir adalah : "+indeksPrestasi);
    }
}
