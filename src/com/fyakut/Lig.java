package com.fyakut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lig<T extends Takim> {
    private String ligAdi;
    ArrayList<T>tümtakımlar=new ArrayList<>();

    public Lig(String ligAdi) {
        this.ligAdi = ligAdi;
    }

    public String getLigAdi() {
        return ligAdi;
    }

    public  boolean takımEkle(T yeniTakım){
        if (tümtakımlar.contains(yeniTakım)){
            System.out.println("takım var"+yeniTakım);
            return false;
        }else
            tümtakımlar.add(yeniTakım);

return true;
    }
    public void puanDurumu(){
        Collections.sort(tümtakımlar,Collections.reverseOrder());
        for (T gecici:tümtakımlar)
            System.out.println(gecici.getTakimAdi()+"puan durumu :"+gecici.takimpuanhesapla());

    }

}
