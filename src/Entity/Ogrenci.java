
package Entity;

public class Ogrenci {
    
    private long id;
    private String AdSoyad;
    private String tc;
    private String tel;
    private Odeme odeme;

    public Ogrenci() {
    }

    public Ogrenci(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    public Ogrenci(String AdSoyad, String tc, String tel, Odeme odeme) {
        this.AdSoyad = AdSoyad;
        this.tc = tc;
        this.tel = tel;
        this.odeme = odeme;
    }

    public Ogrenci(String AdSoyad, String tc, String tel) {
        this.AdSoyad = AdSoyad;
        this.tc = tc;
        this.tel = tel;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Odeme getOdeme() {
        if(this.odeme == null){
            this.odeme = new Odeme();
        }
        return odeme;
    }

    public void setOdeme(Odeme odeme) {
        this.odeme = odeme;
    }

    @Override
    public String toString() {
        if(this.getAdSoyad()== null){
            return "";
        }
        else{
            return this.getId()+";"+this.getAdSoyad()+";"+this.getTc()+";"+this.getTel()+";"+getOdeme().getBorc()+";";
        }
    }
    
    
}
