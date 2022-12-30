
package Controller;

import DAO.EmanetKitapDAO;
import Entity.EmanetKitap;
import Entity.Kitap;
import Entity.Ogrenci;
import java.io.IOException;
import java.util.Date;

public class EmanetKitapController {
    
    private EmanetKitap entity;
    private EmanetKitapDAO dao;
    
    
    public void create(Kitap kitap,Ogrenci ogrenci,Date verilisTarihi,Date teslimTarihi)throws IOException{
        
        EmanetKitap newEmanetKitap = this.getEntity();
        
        newEmanetKitap.setEmanettekiKitap(kitap);
        newEmanetKitap.setKitabiAlanOgrenci(ogrenci);
        newEmanetKitap.getEmanettekiKitap().setId(this.getDao().getSonId()+1);
        newEmanetKitap.setVerilisTarihi(verilisTarihi);
        newEmanetKitap.setTeslimTarihi(teslimTarihi);
        this.getDao().ekle("EmanettekiKitaplar",newEmanetKitap);
        
    }
    
    

    public EmanetKitap getEntity() {
        if(this.entity == null){
            this.entity = new EmanetKitap();
        }
        return entity;
    }

    public void setEntity(EmanetKitap entity) {
        this.entity = entity;
    }

    public EmanetKitapDAO getDao() {
        if(this.dao == null){
            this.dao = new EmanetKitapDAO();
        }
        return dao;
    }

    public void setDao(EmanetKitapDAO dao) {
        this.dao = dao;
    }

    
    
    
    
    
    
}
