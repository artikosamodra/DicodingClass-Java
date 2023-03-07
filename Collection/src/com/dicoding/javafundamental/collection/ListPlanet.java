package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[]args){
        //deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; //Error array Exception

        //menggunakan ArrayList
        List<String> planets = new ArrayList<>();

        //add method untuk menambahkan objek ke List
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); //masih bisa add objek

        System.out.println("List planets awal : ");
        for(int i =0; i < planets.size(); i++){
            System.out.println("\t index-"+i+"="+planets.get(i));
            //get() untuk melihat isi target
            // "\t" = tab teks yang ditampilkan
        }

        planets.remove("venus");

        System.out.println("List planets akhir :");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+i+"="+planets.get(i));
        }

    }
}
