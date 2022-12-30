
package Controller;

import DAO.OgrenciDAO;
import Entity.Odeme;
import Entity.Ogrenci;
import java.io.IOException;

public class OgrenciController {
    
    private Ogrenci entity;
    private OgrenciDAO dao;
    
    
    public void create(String AdSoyad,String tc,String tel,Odeme odeme) throws IOException{
        
        Ogrenci yeniOgrenci = this.getEntity();
        yeniOgrenci.setAdSoyad(AdSoyad);
        yeniOgrenci.setTc(tc);
        yeniOgrenci.setTel(tel);
        yeniOgrenci.setId(this.getDao().getSonId()+1);
        yeniOgrenci.setOdeme(odeme);
        this.getDao().ekle("Ogrenciler", yeniOgrenci);
    }
    

    public Ogrenci getEntity() {
        if(this.entity == null){
            this.entity = new Ogrenci();
        }
        return entity;
    }

    public void setEntity(Ogrenci entity) {
        this.entity = entity;
    }

    public OgrenciDAO getDao() {
        if(this.dao == null){
            this.dao = new OgrenciDAO();
        }
        return dao;
    }

    public void setDao(OgrenciDAO dao) {
        this.dao = dao;
    }
    
    
    
    
    
}
