
package Controller.action;

import Controller.EmanetKitapController;
import Controller.KitapController;
import Controller.OgrenciController;
import Entity.EmanetKitap;
import Entity.Kitap;
import Entity.Ogrenci;
import GUI.KitapTeslimEtSayfasi;
import GUI.KitapTeslimOduncSayfasi;
import GUI.pencere.AnaPencere;
import Util.DosyaIslemleri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class KitapTeslimEtSayfasiActionListener implements ActionListener{
    private KitapTeslimEtSayfasi kitapTeslimEtSayfasi;
    
    private EmanetKitapController emanetKitapController;
    private OgrenciController OgrenciController;
    private KitapController kitapController;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getKitapTeslimEtSayfasi().getGeri_butonu()){
            AnaPencere.build(new KitapTeslimOduncSayfasi());
        }
        if(e.getSource() == getKitapTeslimEtSayfasi().getKitabi_teslim_et_butonu()){
            
            if(getKitapTeslimEtSayfasi().getEmanet_id_alani().getText().equals("")
               ||getKitapTeslimEtSayfasi().getGeciktirdigi_gun_alani().getText().equals("")
               ||getKitapTeslimEtSayfasi().getOdedigi_tutar_alani().getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Lütfen Tüm Alanları Doldurunuz!");
                
            }
            else{
                
                try {
                    
                    int emanetId = Integer.valueOf(getKitapTeslimEtSayfasi().getEmanet_id_alani().getText());
                    int geciktirdigiGun = Integer.valueOf(getKitapTeslimEtSayfasi().getGeciktirdigi_gun_alani().getText());
                    int odedigiTutar = Integer.valueOf(getKitapTeslimEtSayfasi().getOdedigi_tutar_alani().getText());
                    
                    ArrayList<EmanetKitap> emanettekiler = getEmanetKitapController().getDao().getEmanettekiKitaplar();
                    ArrayList<Ogrenci> ogrenciler = getOgrenciController().getDao().getOgrenciler();
                    ArrayList<Kitap> kitaplar = getKitapController().getDao().getKitaplar();
                    
                    boolean kitapVarMi = false;
                    
                    int i = 0;
                    
                    while(i != emanettekiler.size()){
                        
                        if(emanetId == emanettekiler.get(i).getEmanettekiKitap().getId()){
                            
                            kitapVarMi = true;
                            
                            int l = 0;
                            while(l != kitaplar.size()){
                                if(emanettekiler.get(i).getEmanettekiKitap().getKitapAdi().equals(kitaplar.get(l).getKitapAdi())){
                                    kitaplar.get(l).setStokSayisi(kitaplar.get(l).getStokSayisi()+1);
                                    break;
                                }
                                l++;
                            }
                            
                            emanettekiler.get(i).getEmanettekiKitap().setKitapAdi("");
                            new File("data/EmanettekiKitaplar.txt").delete();
                            
                            DosyaIslemleri ds = new DosyaIslemleri();
                            
                            int j = 0;
                            
                            while(j != emanettekiler.size()){
                                ds.yazdir("EmanettekiKitaplar", emanettekiler.get(j).toString());
                                j++;
                            }
                            
                            new File("data/Kitaplar.txt").delete();
                            int k = 0;
                            while(k != kitaplar.size()){
                                ds.yazdir("Kitaplar", kitaplar.get(k).toString());
                                k++;
                            }
                            
             
                            int m = 0;
                            
                            while(m != ogrenciler.size()){
                                
                                if(emanettekiler.get(i).getKitabiAlanOgrenci().getAdSoyad().equals(ogrenciler.get(m).getAdSoyad())){
                                    ogrenciler.get(m).getOdeme().setBorc(ogrenciler.get(m).getOdeme().getBorc()+(float)(geciktirdigiGun*0.5));
                                    ogrenciler.get(m).getOdeme().setBorc(ogrenciler.get(m).getOdeme().getBorc()-odedigiTutar);
                                    break;
                                }
                                m++;
                            }
                           
                            new File("data/Ogrenciler.txt").delete();
                            
                            int n = 0;
                            while(n != ogrenciler.size()){
                                ds.yazdir("Ogrenciler", ogrenciler.get(n).toString());
                                n++;
                            }
                            
                            getKitapTeslimEtSayfasi().getEmanet_id_alani().setText("");
                            getKitapTeslimEtSayfasi().getGeciktirdigi_gun_alani().setText("");
                            getKitapTeslimEtSayfasi().getOdedigi_tutar_alani().setText("");
                            
                            JOptionPane.showMessageDialog(null, "Kitap Başarıyla Geri Teslim Edildi");
                            
                            break;
                        }
                        i++;
                    }
                    
                    if(!kitapVarMi){
                        JOptionPane.showMessageDialog(null, "Girdiğiniz Id'de Emanet Kitap Yok!");
                    }
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(KitapTeslimEtSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(KitapTeslimEtSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            
            
            
        }
    }

    public KitapTeslimEtSayfasiActionListener(KitapTeslimEtSayfasi kitapTeslimEtSayfasi) {
        this.kitapTeslimEtSayfasi = kitapTeslimEtSayfasi;
    }

    public KitapTeslimEtSayfasi getKitapTeslimEtSayfasi() {
        if(this.kitapTeslimEtSayfasi == null){
            kitapTeslimEtSayfasi = new KitapTeslimEtSayfasi();
        }
        return kitapTeslimEtSayfasi;
    }

    public void setKitapTeslimEtSayfasi(KitapTeslimEtSayfasi kitapTeslimEtSayfasi) {
        this.kitapTeslimEtSayfasi = kitapTeslimEtSayfasi;
    }

    public EmanetKitapController getEmanetKitapController() {
        if(this.emanetKitapController == null){
            emanetKitapController = new EmanetKitapController();
        }
        return emanetKitapController;
    }

    public void setEmanetKitapController(EmanetKitapController emanetKitapController) {
        this.emanetKitapController = emanetKitapController;
    }

    public OgrenciController getOgrenciController() {
        if(this.OgrenciController == null){
            OgrenciController = new OgrenciController();
        }
        return OgrenciController;
    }

    public void setOgrenciController(OgrenciController OgrenciController) {
        this.OgrenciController = OgrenciController;
    }

    public KitapController getKitapController() {
        if(this.kitapController == null){
            kitapController = new KitapController();
        }
        return kitapController;
    }

    public void setKitapController(KitapController kitapController) {
        this.kitapController = kitapController;
    }
    
    
    
    
    
}
