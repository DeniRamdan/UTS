package com.sesi6;
import java.util.Scanner;

public class Kerucut extends AbstrakLingkaran{
    Scanner input = new Scanner(System.in);
    int jari;
    int s;
    int tinggi;
    double phi = 3.14;
    double LuasPermukaan ;
    double Volume ;

    @Override
    public double LuasPermukaan() {
            System.out.println("======= MENGHITUNG LUAS PERMUKAAN KERUCUT =======");
            System.out.print("Masukan Jari - Jari                   : ");
            jari =input.nextInt();
            System.out.print("Masukan Garis Pelukis                 :");
            s = input.nextInt();
            LuasPermukaan =  phi * jari*jari + phi * jari *s;
            System.out.println("Luas Permukaan Kerucut Tersebut Adalah : "+LuasPermukaan);
            return LuasPermukaan;
    }
    
    @Override
    public double Volume() {
        System.out.println("======= MENGHITUNG VOLUME KERUCUT =======");
        System.out.print("Masukan Jari - Jari                        : ");
        jari =input.nextInt();
        System.out.print("Masukan tinggi                             :");
        tinggi = input.nextInt();
        Volume = 1/3 * phi * (jari * jari) * tinggi;
        System.out.println("VOLUME Tersebut Adalah                      : "+Volume);
        System.out.println("========================================================");
        return Volume;
        
    }
    @Override
    public void display() {
        LuasPermukaan();
        Volume();
        
    }
}

