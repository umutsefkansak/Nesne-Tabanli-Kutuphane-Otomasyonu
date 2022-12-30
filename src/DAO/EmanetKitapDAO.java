
package DAO;

import Entity.EmanetKitap;
import Util.DosyaIslemleri;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class EmanetKitapDAO extends AbstractDAO<EmanetKitap>{

    @Override
    public void ekle(String kaydedilecekYer, EmanetKitap entity) throws IOException {
        DosyaIslemleri islemler = new DosyaIslemleri();
        islemler.yazdir(kaydedilecekYer, entity.toString());;
        islemler.yazdir("Idler/EmanettekiKitapIdleri", entity.getEmanettekiKitap().getId());
    }
    
    
    public int getSonId() throws IOException{
        DosyaIslemleri islemler = new DosyaIslemleri();
        return islemler.getSonId("Idler/EmanettekiKitapIdleri");
    }
    
    
    
    public ArrayList<EmanetKitap> getEmanettekiKitaplar() throws IOException, ParseException{
        
        ArrayList<EmanetKitap> emanettekiKitaplar = new ArrayList<EmanetKitap>();
        DosyaIslemleri islemler = new DosyaIslemleri();
        String satirlar[] =islemler.oku("EmanettekiKitaplar").split(";");
        
        int i = 0;
        while(i<satirlar.length){
            EmanetKitap emanetKitap = new EmanetKitap();
            
            emanetKitap.getEmanettekiKitap().setId(Long.valueOf(satirlar[i]));
            i++;
            emanetKitap.getEmanettekiKitap().setKitapAdi(satirlar[i]);
            i++;
            emanetKitap.getEmanettekiKitap().setYazari(satirlar[i]);
            i++;
            emanetKitap.getEmanettekiKitap().setTuru(satirlar[i]);
            i++;
            emanetKitap.getEmanettekiKitap().setSayfaSayisi(Integer.valueOf(satirlar[i]));
            i++;
            emanetKitap.getKitabiAlanOgrenci().setAdSoyad(satirlar[i]);
            i++;
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            
            Date veris = formatter.parse(satirlar[i]);
            emanetKitap.setVerilisTarihi(veris);
            i++;
            
            Date alis = formatter.parse(satirlar[i]);
            emanetKitap.setTeslimTarihi(alis);
            i++;
            emanettekiKitaplar.add(emanetKitap);
        }     
        return emanettekiKitaplar;
    }
    
}
