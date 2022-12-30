
package Controller.action;

import Controller.OgrenciController;
import Entity.Ogrenci;
import GUI.OgrenciIslemleriSayfasi;
import GUI.OgrenciListesiSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OgrenciListesiSayfasiActionListener implements ActionListener{
    
    private OgrenciListesiSayfasi ogrenciListesiSayfasi;
    private OgrenciController controller;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == getOgrenciListesiSayfasi().getAnasayfa_butonu()){
            AnaPencere.build(new OgrenciIslemleriSayfasi());
        }
        
        if(e.getSource() == getOgrenciListesiSayfasi().getListele_butonu()){
            try {
                ArrayList<Ogrenci> ogrenciler = getController().getDao().getOgrenciler();
              
                
                int i = 0;
                
                while(i != ogrenciler.size()){
                    String[] data = ogrenciler.get(i).toString().split(";");
                    getOgrenciListesiSayfasi().getModel().addRow(data);
                    i++;
                }
            } catch (IOException ex) {
                Logger.getLogger(OgrenciListesiSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public OgrenciListesiSayfasiActionListener(OgrenciListesiSayfasi ogrenciListesiSayfasi) {
        this.ogrenciListesiSayfasi = ogrenciListesiSayfasi;
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
    
    public OgrenciListesiSayfasi getOgrenciListesiSayfasi() {
        if(this.ogrenciListesiSayfasi == null){
            ogrenciListesiSayfasi = new OgrenciListesiSayfasi();
        }
        return ogrenciListesiSayfasi;
    }

    public void setOgrenciListesiSayfasi(OgrenciListesiSayfasi ogrenciListesiSayfasi) {
        this.ogrenciListesiSayfasi = ogrenciListesiSayfasi;
    }
    
    
}
