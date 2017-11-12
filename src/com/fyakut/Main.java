package com.fyakut;

public class Main {

    public static void main(String[] args) {

        BasketBoloyuncu efespilsen=new BasketBoloyuncu("ömer");
        BasketBoloyuncu fenerbulker=new BasketBoloyuncu("umran");

        FutbolOyuncu fenerbahce=new FutbolOyuncu("alex");
        FutbolOyuncu beşiktaş=new FutbolOyuncu("cerrad");

        Takim<FutbolOyuncu> trabzon=new Takim("trabzon Futbol");
        Takim<BasketBoloyuncu> bjk=new Takim("Bjk Basketbol takımı");
        Takim<BasketBoloyuncu> darüşafaka=new Takim("Basketbol takımı");
        Takim<FutbolOyuncu> fener=new Takim("fenerbahçe Futbol");
        Takim<FutbolOyuncu> gs=new Takim("gs takımı");

        trabzon.oyuncuekle(beşiktaş);
        bjk.oyuncuekle(fenerbulker);
        bjk.oyuncuekle(fenerbulker);
        bjk.oyuncuekle(efespilsen);
        System.out.println(trabzon.oyuncuSayisi());

     /**  onlemek için =public class Takim<T extends Oyuncu>  yapılmalıdır,
      *
        Takim<String>bozuktakm=new Takim<String>("Basketet");
        bozuktakm.oyuncuekle("abc")
      */

        trabzon.macyap(fener,3,2);
     fener.macyap(gs,6,0);
     /** // bjk.macyap(fener,5,1);hata vermelidir.Basket ile futbol mac yapmamalı. macyap metodunda Takim<T> RakipTakim duzeldi */
        trabzon.macyap(gs,0,0);
     darüşafaka.macyap(bjk,80,96);

        System.out.println("gs futbol puan:"+gs.takimpuanhesapla());
        System.out.println("trabzon futbol puan:"+trabzon.takimpuanhesapla());
        System.out.println("fener futbol puan:"+fener.takimpuanhesapla());
        System.out.println("bjk basket puan:"+bjk.takimpuanhesapla());
        System.out.println("darüşafaka basket  puan:"+darüşafaka.takimpuanhesapla());


        Lig<Takim<FutbolOyuncu>> futbolligi=new Lig<>("1.Super lig");
        futbolligi.takımEkle(fener);
        //futbolligi.takımEkle(bjk);ekleyememeli
        futbolligi.takımEkle(gs);
        futbolligi.takımEkle(trabzon);
       // futbolligi.takımEkle(efespilsen);ekleyememeli

        futbolligi.puanDurumu();
    }
}
