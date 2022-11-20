package com.sesi6;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int pilih;
    static int n;

    void display() {
        System.out.println("================================================");
        System.out.println("Nama  : Deni Ramdan Septian");
        System.out.println("Nim   : 20210040055");
        System.out.println("Kelas : TI21C");
        System.out.println("===============================================\n");
        System.out.println("== UTS PEMROGRAMAN BERORIENTASI OBJEK SESI  ==");
        System.out.println("===============================================");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.display();
        for (n = 0; n < 99; n++) {
            System.out.println("================== BANGUN RUANG =================");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. KERUCUT");
            System.out.println("5. TABUNG");
            System.out.println("=================================================");
            System.out.print("Masukan Pilihan Anda : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                Kubus kubus = new Kubus();
                kubus.display();
            } else if (pilih == 2) {
                Balok balok = new Balok();
                balok.display();
            } else if (pilih == 3) {

                Bola bola = new Bola();
                bola.display();
            }else if (pilih == 4){
                Kerucut kerucut = new Kerucut();
                kerucut.display();
            }else if (pilih == 5 ){
                Tabung tabung = new Tabung();
                tabung.Lalas();
                tabung.LSelimut();
                tabung.LuasPermukaan();
                tabung.Volume();
                
            }
             else {
                System.out.println("Pilihan Anda Tidak Ada Di Daftar , Silahkan Pilih kembali pilihan anda");
            }
        }

    }
}
