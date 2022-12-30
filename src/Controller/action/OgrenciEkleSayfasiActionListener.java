
package Controller.action;

import Controller.OgrenciController;
import Entity.Odeme;
import GUI.OgrenciEkleSayfasi;
import GUI.OgrenciIslemleriSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class OgrenciEkleSayfasiActionListener implements ActionListener{
    
    private OgrenciEkleSayfasi ogrenciEkleSayfasi;
    private OgrenciController controller;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getOgrenciEkleSayfasi().getAnasayfa_butonu()){
            AnaPencere.build(new OgrenciIslemleriSayfasi());
        }
        if(e.getSource() == getOgrenciEkleSayfasi().getOgrenci_ekle_butonu()){
            
            if(getOgrenciEkleSayfasi().getAdi_alani().getText().equals("")
               ||getOgrenciEkleSayfasi().getSoyadi_alani().getText().equals("")
               ||getOgrenciEkleSayfasi().getTc_alani().getText().equals("")
               ||getOgrenciEkleSayfasi().getTel_alani().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Lütfen Tüm Alanları Doldurunuz!");
                
            }
            else if(getOgrenciEkleSayfasi().getTc_alani().getText().length() != 11
                    || getOgrenciEkleSayfasi().getTel_alani().getText().length() != 11 ){
                JOptionPane.showMessageDialog(null, "Lütfen geçerli bir TC veya Tel giriniz!");
                
            }
            
            else{
                try {
                    String adiSoyadi = getOgrenciEkleSayfasi().getAdi_alani().getText()+" "+getOgrenciEkleSayfasi().getSoyadi_alani().getText();
                    String tc = getOgrenciEkleSayfasi().getTc_alani().getText();
                    String tel = getOgrenciEkleSayfasi().getTel_alani().getText();
                    getController().create(adiSoyadi, tc, tel, new Odeme());
                    
                    getOgrenciEkleSayfasi().getAdi_alani().setText("");
                    getOgrenciEkleSayfasi().getSoyadi_alani().setText("");
                    getOgrenciEkleSayfasi().getTc_alani().setText("");
                    getOgrenciEkleSayfasi().getTel_alani().setText("");
                    JOptionPane.showMessageDialog(null, "Öğrenci Başarıyla Eklendi!");
                    
                } catch (IOException ex) {
                    Logger.getLogger(OgrenciEkleSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    public OgrenciEkleSayfasiActionListener(OgrenciEkleSayfasi ogrenciEkleSayfasi) {
        this.ogrenciEkleSayfasi = ogrenciEkleSayfasi;
    }

    public OgrenciEkleSayfasi getOgrenciEkleSayfasi() {
        if(this.ogrenciEkleSayfasi == null){
            ogrenciEkleSayfasi = new OgrenciEkleSayfasi();
        }
        return ogrenciEkleSayfasi;
    }

    public void setOgrenciEkleSayfasi(OgrenciEkleSayfasi ogrenciEkleSayfasi) {
        this.ogrenciEkleSayfasi = ogrenciEkleSayfasi;
    }

    public OgrenciController getController() {
        if(this.controller == null){
            controller = new OgrenciController();
        }
        return controller;
    }

    public void setController(OgrenciController controller) {
        this.controller = controller;
    }
    
    
    
    
}
