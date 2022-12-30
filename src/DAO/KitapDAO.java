
package DAO;

import Entity.Kitap;
import Util.DosyaIslemleri;
import java.io.IOException;
import java.util.ArrayList;


public class KitapDAO extends AbstractDAO<Kitap>{



    @Override
    public void ekle(String kaydedilecekYer, Kitap entity) throws IOException {
        DosyaIslemleri islemler = new DosyaIslemleri();
        islemler.yazdir(kaydedilecekYer, entity.toString());
        islemler.yazdir("Idler/kitapIdleri", entity.getId());
    }
    
    public int getSonId() throws IOException{
        DosyaIslemleri islemler = new DosyaIslemleri();
        return islemler.getSonId("Idler/KitapIdleri");
    }
    
    public ArrayList<Kitap> getKitaplar() throws IOException{
        DosyaIslemleri islemler = new DosyaIslemleri();
        ArrayList<Kitap> kitaplar = new ArrayList<Kitap>();
       
        String[] satirlar = islemler.oku("Kitaplar").split(";");
 
       int i = 0;
       while(i<satirlar.length){
            Kitap kitap = new Kitap();
            kitap.setId(Long.valueOf(satirlar[i]));
            i++;
            kitap.setKitapAdi(satirlar[i]);
            i++;
            kitap.setYazari(satirlar[i]);
            i++;
            kitap.setTuru(satirlar[i]);
            i++;
            kitap.setSayfaSayisi(Integer.valueOf(satirlar[i]));
            i++;
            kitap.setStokSayisi(Integer.valueOf(satirlar[i]));
            i++;
            kitaplar.add(kitap);
       }
        return kitaplar;
    }
    
}
