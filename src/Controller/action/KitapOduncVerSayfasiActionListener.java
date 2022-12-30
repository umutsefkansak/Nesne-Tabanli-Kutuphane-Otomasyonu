
package Controller.action;

import Controller.EmanetKitapController;
import Controller.KitapController;
import Controller.OgrenciController;
import Entity.EmanetKitap;
import Entity.Kitap;
import Entity.Ogrenci;
import GUI.KitapOduncVerSayfasi;
import GUI.KitapTeslimOduncSayfasi;
import GUI.pencere.AnaPencere;
import Util.DosyaIslemleri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class KitapOduncVerSayfasiActionListener implements ActionListener{
    
    private KitapOduncVerSayfasi kitapOduncVerSayfasi;
    private KitapController KitapController;
    private EmanetKitapController EmanetKitapController;
    private OgrenciController ogrenciController;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getKitapOduncVerSayfasi().getAnasayfa_butonu()){
            AnaPencere.build(new KitapTeslimOduncSayfasi());
        }
        if(e.getSource() == getKitapOduncVerSayfasi().getKitap_odunc_butonu()){
            
            try {
                
                if(getKitapOduncVerSayfasi().getKitap_id_alani().getText().equals("")
                   ||getKitapOduncVerSayfasi().getOgrenci_id_alani().getText().equals("")
                   ||getKitapOduncVerSayfasi().getAlis_tarihi_alani().getText().equals("")
                   ||getKitapOduncVerSayfasi().getTeslim_tarihi_alani().getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Lütfen Tüm Alanları Doldurunuz!");
                }
                else{
                    ArrayList<Kitap> kitaplar = getKitapController().getDao().getKitaplar();
                    ArrayList<EmanetKitap> emanettekiKitaplar = getEmanetKitapController().getDao().getEmanettekiKitaplar();
                    ArrayList<Ogrenci> ogrenciler = getOgrenciController().getDao().getOgrenciler();
                
                    int KitapId = Integer.valueOf(getKitapOduncVerSayfasi().getKitap_id_alani().getText());
                    int ogrenciId = Integer.valueOf(getKitapOduncVerSayfasi().getOgrenci_id_alani().getText());
                    String alisTarihi = getKitapOduncVerSayfasi().getAlis_tarihi_alani().getText();
                    String teslimTarihi = getKitapOduncVerSayfasi().getTeslim_tarihi_alani().getText();
                
                    Date alis = null;
                    Date teslim = null;
                
        
                    DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                
                    teslim = f.parse(teslimTarihi);
                    alis = f.parse(alisTarihi);
           
                
                    boolean kitapVarMi = false;
                    boolean ogrenciVarMi = false;
                
                    int i = 0;
                    while(i != kitaplar.size()){
                        if(KitapId == kitaplar.get(i).getId()){
                            kitapVarMi = true;
                            if(!(kitaplar.get(i).getStokSayisi()>0)){
                                JOptionPane.showMessageDialog(null, "Stokta İstediğiniz Kitap Yok");
                                break;
                            }
                            else{
                                int k = 0;
                                while(k != ogrenciler.size()){
                                    if(ogrenciId == ogrenciler.get(k).getId()){
                                       ogrenciVarMi = true;
                                       break;
                                    }
                                    k++;
                                }
                                if(ogrenciVarMi){
                                    kitaplar.get(i).setStokSayisi(kitaplar.get(i).getStokSayisi()-1);
                                    new File("data/Kitaplar.txt").delete();
                                    DosyaIslemleri ds = new DosyaIslemleri();
                            
                                    int j = 0;
                            
                                    while(j != kitaplar.size()){
                                        ds.yazdir("Kitaplar", kitaplar.get(j).toString());
                                        j++;
                                    }
                                    getEmanetKitapController().create(kitaplar.get(i), ogrenciler.get(k), alis, teslim);
                                   
                                    getKitapOduncVerSayfasi().getKitap_id_alani().setText("");
                                    getKitapOduncVerSayfasi().getOgrenci_id_alani().setText("");
                                    getKitapOduncVerSayfasi().getAlis_tarihi_alani().setText("");
                                    getKitapOduncVerSayfasi().getTeslim_tarihi_alani().setText("");
                                    JOptionPane.showMessageDialog(null, "Kitap Başarıyla Ödünç Verildi!");
                                    break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Geçersiz Öğrenci Id'si!");
                                    break;
                                }
                            }
                        }
                        i++;
                    }
                    if(!kitapVarMi){
                        JOptionPane.showMessageDialog(null, "Girdiğiniz Id'de kitap bulunmamaktadır");
                    }
                }
                
            } catch (IOException ex) {
                Logger.getLogger(KitapOduncVerSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(KitapOduncVerSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public KitapOduncVerSayfasiActionListener(KitapOduncVerSayfasi kitapOduncVerSayfasi) {
        this.kitapOduncVerSayfasi = kitapOduncVerSayfasi;
    }

    public KitapOduncVerSayfasi getKitapOduncVerSayfasi() {
        if(this.kitapOduncVerSayfasi == null){
            this.kitapOduncVerSayfasi = new KitapOduncVerSayfasi();
        }
        return kitapOduncVerSayfasi;
    }

    public void setKitapOduncVerSayfasi(KitapOduncVerSayfasi kitapOduncVerSayfasi) {
        this.kitapOduncVerSayfasi = kitapOduncVerSayfasi;
    }

    public KitapController getKitapController() {
        if(this.KitapController == null){
            KitapController = new KitapController();
        }
        return KitapController;
    }

    public void setKitapController(KitapController KitapController) {
        this.KitapController = KitapController;
    }

    public EmanetKitapController getEmanetKitapController() {
        if(this.EmanetKitapController == null){
            this.EmanetKitapController = new EmanetKitapController();
        }
        return EmanetKitapController;
    }

    public void setEmanetKitapController(EmanetKitapController EmanetKitapController) {
        this.EmanetKitapController = EmanetKitapController;
    }

    public OgrenciController getOgrenciController() {
        if(this.ogrenciController == null){
            ogrenciController = new OgrenciController();
        }
        return ogrenciController;
    }

    public void setOgrenciController(OgrenciController ogrenciController) {
        this.ogrenciController = ogrenciController;
    }
    
    
}
