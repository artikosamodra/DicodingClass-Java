package com.dicoding.fundamental.inheritance;

public class Kucing extends Hewan implements Mamalia{

    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat){
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return "Kucing ras:" + ras + ", habitat: "+habitat;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof  Kucing){
            Kucing other = (Kucing) obj;
            return  this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public Kucing(){
        super(); //akan tetap memanggil constructor dari parent/superclass
        System.out.println("construct Kucing");
    }

    @Override
    public void makan() {
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food){
        System.out.println("Kucing makan "+food);
    }
}
