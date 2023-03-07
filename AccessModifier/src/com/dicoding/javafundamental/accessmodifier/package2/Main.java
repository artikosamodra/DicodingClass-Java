package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class Main {
    public static void main(String []args){
        KelasA kelasA = new KelasA();

        //Menunjukan error karena tidak satu package & memberB/memberC dalam keadaan private
        //System.out.println(kelasA.functionB());
        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);

        //agar dapat dipanggil dari KelasB extends KelasA
        //maka gunakan protect dan dipanggil kembali di Kelas B dengan super.Subclass.. karena dafault tidak dapat mengakses subclass ketika berbeda package
        //aturan 'private' dapat mengakses Class
        //aturan 'default' dapat mengakses Class dan Package
        //aturan 'protect' dapat mengakses Class,  Package dan Subclass
        //aturan 'public' dapat mengakses semua (Class, Package, Subclass dan World)


        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
