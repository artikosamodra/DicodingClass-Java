package com.dicoding.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[]args){
        char input = 'C';
        int output = 0;

        switch (input){
            case 'A':
                output++;
            case 'B':
                output++;
            // case C = output++ = nilai awal 0 + 1 = 1,
            // namun tidak ada break, maka nilai terus bertambah hingga case terakhir
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            case 'F':
                output++;
            default:
                output++;
        }
        System.out.println("NIlai akhirnya adalah : "+output);
    }
}
