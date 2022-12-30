
package DAO;

import Entity.Personel;
import Util.DosyaIslemleri;
import java.io.IOException;
import java.util.ArrayList;


public class PersonelDAO {
    
    public ArrayList<Personel> getPersoneller() throws IOException{
        DosyaIslemleri ds = new DosyaIslemleri();
        
        ArrayList<Personel> personeller = new ArrayList<>();
        
        String[] satirlar = ds.oku("Personeller").split(";");
        
        int i = 0;
        while(i<satirlar.length){
            Personel personel = new Personel();
            personel.setKullaniciAdi(satirlar[i]);
            i++;
            personel.setParola(satirlar[i]);
            i++;
            personeller.add(personel);
        }
        return personeller;
    }
}
