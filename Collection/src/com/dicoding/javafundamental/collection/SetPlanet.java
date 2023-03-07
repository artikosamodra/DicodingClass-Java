package com.dicoding.javafundamental.collection;

import java.util.*;


public class SetPlanet {
    public static void main(String []args){
        //use HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

        System.out.println("Set planets awal: (size ="+planets.size()+")");
        for (String planet : planets){
            System.out.println("\t"+planet);
        }

        planets.remove("venus");

        System.out.println("Set planets akhir: (size ="+planets.size()+")");
        //for (String planet : planets){
        for(Iterator iterator = planets.iterator(); iterator.hasNext();){
            //Looping dengan iterator
            //System.out.println("\t"+planet);
            System.out.println("\t"+iterator.next());

            //menggunakan iterator ataupun String hasilnya sama
        }
    }
}
