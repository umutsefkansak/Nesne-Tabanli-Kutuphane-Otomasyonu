
package Entity;


public class Personel {
    
    private String kullaniciAdi;
    private String parola;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return getKullaniciAdi()+";"+getParola()+";";
    }
    
    
    
}
