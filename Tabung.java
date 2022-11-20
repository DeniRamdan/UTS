package com.sesi6;

import java.util.Scanner;

public class Tabung extends AbstrakLingkaran {
    Scanner input = new Scanner(System.in);
    int jari;
    int tinggi;
    double phi = 3.14;
    double LuasAlas;
    double LuasSelimut;
    double LuasPermukaan;
    double Volume;

    void Lalas() {
        System.out.print("Masukan jari jari         : ");
        jari = input.nextInt();
        LuasAlas = phi * jari * jari;
        System.out.println("Luas Alas nya adalah      : " +LuasAlas);

    }
    void LSelimut(){
       
        System.out.print("Masukan Tinggi            : ");
        tinggi = input.nextInt();
        LuasSelimut = phi * jari *tinggi;
        System.out.println("Luas Selimut               : " +LuasSelimut);


    }

    @Override
    public double LuasPermukaan() {
        System.out.println("======= MENGHITUNG LUAS PERMUKAAN TABUNG =======");
        LuasPermukaan = (2 * LuasAlas)+ LuasSelimut;
        System.out.println("Luas Permukaan Tersebut Adalah : " + LuasPermukaan);
        return LuasPermukaan;
    }

    @Override
    public double Volume() {
        System.out.println("======= MENGHITUNG VOLUME TABUNG =======");
        
        Volume = phi * jari * jari * tinggi;
        System.out.println("VOLUME Tersebut Adalah         : " + Volume);
        System.out.println("========================================================");
        return Volume;

    }

    @Override
    public void display() {
        Lalas();
        LSelimut();
        LuasPermukaan();
        Volume();

    }
}
