package com.fyakut;

import java.util.ArrayList;

public class Takim<T extends Oyuncu> implements Comparable<Takim<T>>{
    private String takimAdi;
     int oynadıgımacayısı=0;
   int beraberliksayisi=0;
   int kazanmascSayisi=0;
    int kaybedilenmacSayisi=0;
private ArrayList<T>oyuncular=new ArrayList<>();


    public Takim() {
    }

    public Takim(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public String getTakimAdi() {
        return takimAdi;
    }
public boolean oyuncuekle(T yeniOyuncu){
        if (oyuncular.contains(yeniOyuncu)){
            System.out.println(yeniOyuncu.getIsim()+"Zaten var");
        return false;}
        else
            oyuncular.add(yeniOyuncu);
            System.out.println(yeniOyuncu.getIsim()+"yenioyuncueklendi");
        return true;
}
public int oyuncuSayisi(){
    return oyuncular.size();
}

    public  void macyap(Takim<T> RakipTakim,int benimSkorum,int rakipskoru){
    String mesaj="";
    if (benimSkorum>rakipskoru){
        mesaj="kazandı";
        kazanmascSayisi++;}
    else if (benimSkorum<rakipskoru){
        mesaj="kaybetti";
        kaybedilenmacSayisi++;}
    else{
        mesaj="berabere kaldı";
        beraberliksayisi++;}
oynadıgımacayısı++;

    if (RakipTakim!=null){
        System.out.println(this.getTakimAdi()+mesaj+RakipTakim.getTakimAdi());
        RakipTakim.macyap(null,rakipskoru,benimSkorum);
    }

    }
    public int takimpuanhesapla(){
       return (kazanmascSayisi*3)+(beraberliksayisi*1);
    }


    @Override
    public int compareTo(Takim<T> o) {
        if (this.takimpuanhesapla()>o.takimpuanhesapla())
            return 1;
        else if (this.takimpuanhesapla()<o.takimpuanhesapla())
            return -1;
            else
        return 0;
    }
}
