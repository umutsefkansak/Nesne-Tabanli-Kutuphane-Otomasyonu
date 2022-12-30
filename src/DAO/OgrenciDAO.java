
package DAO;

import Entity.Ogrenci;
import Util.DosyaIslemleri;
import java.io.IOException;
import java.util.ArrayList;

public class OgrenciDAO extends AbstractDAO<Ogrenci>{

    @Override
    public void ekle(String kaydedilecekYer, Ogrenci entity) throws IOException {
        DosyaIslemleri islemler = new DosyaIslemleri();
        islemler.yazdir(kaydedilecekYer, entity.toString());
        islemler.yazdir("Idler/OgrenciIdleri", entity.getId());
    }
    
    public int getSonId() throws IOException{
        DosyaIslemleri islemler = new DosyaIslemleri();
        return islemler.getSonId("Idler/OgrenciIdleri");
    }
    
    
    public ArrayList<Ogrenci> getOgrenciler() throws IOException{
        DosyaIslemleri islemler = new DosyaIslemleri();
        
        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        
        String[] satirlar = islemler.oku("Ogrenciler").split(";");
        
        int i = 0;
        while(i<satirlar.length){
            Ogrenci ogrenci = new Ogrenci();
            ogrenci.setId(Long.valueOf(satirlar[i]));
            i++;
            ogrenci.setAdSoyad(satirlar[i]);
            i++;
            ogrenci.setTc(satirlar[i]);
            i++;
            ogrenci.setTel(satirlar[i]);
            i++;
            ogrenci.getOdeme().setBorc(Float.valueOf(satirlar[i]));
            i++;
            ogrenciler.add(ogrenci);
        }
        
        return ogrenciler;
    }
    
}
