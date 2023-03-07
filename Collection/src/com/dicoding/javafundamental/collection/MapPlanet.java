package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[]args){
        //Use HashMap

        Map<String, Planet> planets = new HashMap<>();
        //put() method = menambahkan objek ke Map
        planets.put("key-1", new Planet("Mercury", 0.06));
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        planets.put("key-4", new Planet("Mars-X", 0.11)); //menambah ke map dengan key yg sama

        System.out.println("Map planets awal: (size = "+planets.size()+")");

        //looping key dari Map
        for (String key : planets.keySet()){
            System.out.println(("\t"+key+" : "+planets.get(key)));
        }

        planets.remove("key-2");
        System.out.println("Map planets akhir: (size = "+planets.size()+")");
        for (String key : planets.keySet()) {
            System.out.println(("\t" + key + " : " + planets.get(key)));
        }

        System.out.println("");
        System.out.println("Map planets akhir: (size = "+planets.size()+")");
        for (Planet planet : planets.values()){
        System.out.println("\t"+planet);

        }


    }
}
