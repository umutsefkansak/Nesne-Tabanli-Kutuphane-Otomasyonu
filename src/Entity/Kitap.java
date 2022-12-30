
package Entity;

public class Kitap {
    
    private  long id;
    private String kitapAdi;
    private int sayfaSayisi;
    private String turu;
    private String yazari;
    private int stokSayisi;

    public int getStokSayisi() {
        return stokSayisi;
    }

    public void setStokSayisi(int stokSayisi) {
        this.stokSayisi = stokSayisi;
    }

    public Kitap(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    
    public Kitap() {
        
    }
    
    public Kitap(String kitapAdi, int sayfaSayisi, String turu, String yazari,int stokSayisi) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.turu = turu;
        this.yazari = yazari;
        this.stokSayisi = stokSayisi;
    }

    public Kitap(String kitapAdi, int sayfaSayisi, String turu, String yazari) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.turu = turu;
        this.yazari = yazari;
    }
    
    
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

     @Override
    public String toString() {
        return id+";"+kitapAdi+";"+yazari+";"+turu+";"+sayfaSayisi+";"+stokSayisi+";";
    }

    
}
