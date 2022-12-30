
package Controller;

import DAO.KitapDAO;
import Entity.Kitap;
import java.io.IOException;

public class KitapController {
    
    private Kitap entity;
    private KitapDAO dao;
    
    public void create(String kitapAdi, String yazari, String turu, int sayfaSayisi,int stokSayisi) throws IOException{
        Kitap yeniKitap = this.getEntity();
        yeniKitap.setKitapAdi(kitapAdi);
        yeniKitap.setSayfaSayisi(sayfaSayisi);
        yeniKitap.setTuru(turu);
        yeniKitap.setYazari(yazari);
        yeniKitap.setStokSayisi(stokSayisi);
        yeniKitap.setId(this.getDao().getSonId()+1);
        this.getDao().ekle("Kitaplar",yeniKitap);
    }
    
    public Kitap getEntity() {
        if(this.entity == null){
            this.entity = new Kitap();
        }
        return entity;
    }

    public void setEntity(Kitap entity) {
        this.entity = entity;
    }

    public KitapDAO getDao() {
        if(this.dao == null){
            this.dao = new KitapDAO();
        }
        return dao;
    }

    public void setDao(KitapDAO dao) {
        this.dao = dao;
    }
    
    
    
}
