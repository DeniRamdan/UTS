package com.sesi6;
import java.util.Scanner;

public class Kubus extends AbstrakKotak{
    Scanner input = new Scanner(System.in);
    int sisi;
    int RusukKubus =12;
    double LuasPermukaan ;
    double Volume ;

   @Override
   public void RusukBangunRuang() {
        System.out.println("Jumlah Rusuk Kubus adalah               : "+RusukKubus);
       super.RusukBangunRuang();
   }

    @Override
    public double LuasPermukaan() {
            System.out.println("======== MENGHITUNG LUAS PERMUKAAN KUBUS =========");
            System.out.print("Masukan Sisi                        : ");
            sisi =input.nextInt();
            LuasPermukaan =6 * sisi * sisi;
            System.out.println("Luas Permukaan Kubus Tersebut Adalah : "+LuasPermukaan);
            return LuasPermukaan;
    }

    @Override
    public double Volume () {
            System.out.println("============= MENGHITUNG VOLUME KUBUS =============");
            Volume =sisi * sisi * sisi;
            System.out.println("Luas Permukaan Kubus Tersebut Adalah  : "+Volume);
            RusukBangunRuang();
            System.out.println("===================================================");
            return Volume;
    }

    @Override
    public void display() {
        LuasPermukaan();
        Volume();
        
    }

}
