
package Controller.action;

import Controller.KitapController;
import Entity.Kitap;
import GUI.AnaSayfa;
import GUI.KitapListesiSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KitapListesiSayfasiActionListener implements ActionListener{
    
    private KitapListesiSayfasi kitapListesiSayfasi;
    private KitapController controller;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == kitapListesiSayfasi.getListele_butonu()){
            try {
                ArrayList<Kitap> kitaplar = getController().getDao().getKitaplar();
                
                int i = 0;
                while(i != kitaplar.size()){
                    String[] data = kitaplar.get(i).toString().split(";");
                    kitapListesiSayfasi.getModel().addRow(data);
                    i++;
                }
            } catch (IOException ex) {
                Logger.getLogger(KitapListesiSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(e.getSource() == kitapListesiSayfasi.getAnasayfa_butonu()){
            AnaPencere.build(new AnaSayfa());
        }
    }

    public KitapListesiSayfasiActionListener(KitapListesiSayfasi kitapListesiSayfasi) {
        this.kitapListesiSayfasi = kitapListesiSayfasi;
    }

    public KitapListesiSayfasi getKitapListesiSayfasi() {
        return kitapListesiSayfasi;
    }

    public void setKitapListesiSayfasi(KitapListesiSayfasi kitapListesiSayfasi) {
        this.kitapListesiSayfasi = kitapListesiSayfasi;
    }

    public KitapController getController() {
        if(this.controller == null){
            this.controller = new KitapController();
        }
        return controller;
    }

    public void setController(KitapController controller) {
        this.controller = controller;
    }


    
    
}
