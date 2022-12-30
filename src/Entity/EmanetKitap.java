
package Entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmanetKitap {

    private Kitap emanettekiKitap;
    private Ogrenci kitabiAlanOgrenci;
    private Date verilisTarihi;
    private Date teslimTarihi;
    private DateFormat format;
    

    public EmanetKitap() {
    }

    public EmanetKitap(Kitap emanettekiKitap, Ogrenci kitabiAlanOgrenci, Date verilisTarihi, Date teslimTarihi) {
        this.emanettekiKitap = emanettekiKitap;
        this.kitabiAlanOgrenci = kitabiAlanOgrenci;
        this.verilisTarihi = verilisTarihi;
        this.teslimTarihi = teslimTarihi;
    }

    
    public Kitap getEmanettekiKitap() {
        if(this.emanettekiKitap == null){
            this.emanettekiKitap = new Kitap();
        }
        return emanettekiKitap;
    }

    public void setEmanettekiKitap(Kitap emanettekiKitap) {
        this.emanettekiKitap = emanettekiKitap;
    }

    public Ogrenci getKitabiAlanOgrenci() {
        if(this.kitabiAlanOgrenci == null){
            this.kitabiAlanOgrenci = new Ogrenci();
        }
        return kitabiAlanOgrenci;
    }

    public void setKitabiAlanOgrenci(Ogrenci kitabiAlanOgrenci) {
        this.kitabiAlanOgrenci = kitabiAlanOgrenci;
    }

    public String getVerilisTarihi() {
        return getFormat().format(verilisTarihi);
    }

    public void setVerilisTarihi(Date verilisTarihi) {
        
        this.verilisTarihi = verilisTarihi;
    }

    public String getTeslimTarihi() {
        return getFormat().format(teslimTarihi);
    }

    public void setTeslimTarihi(Date teslimTarihi) {
        
        this.teslimTarihi = teslimTarihi;
    }

    public DateFormat getFormat() {
        if(this.format == null){
            this.format = new SimpleDateFormat("dd/MM/yyyy");
        }
        return format;
    }

    public void setFormat(DateFormat format) {
        this.format = format;
    }
    
    
    
    @Override
    public String toString() {
        if(emanettekiKitap.getKitapAdi() == ""){
            return "";
        }
        else{
            return emanettekiKitap.getId()+";"+emanettekiKitap.getKitapAdi()+";"+emanettekiKitap.getYazari()+";"
               +emanettekiKitap.getTuru()+";"+emanettekiKitap.getSayfaSayisi()+";"
               +kitabiAlanOgrenci.getAdSoyad()+";"+getVerilisTarihi()+";"+getTeslimTarihi()+";";
        }
        
    }
    
   
    
    
}
