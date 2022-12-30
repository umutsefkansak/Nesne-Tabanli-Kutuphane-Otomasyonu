
package Controller.action;

import Controller.EmanetKitapController;
import Entity.EmanetKitap;
import GUI.AnaSayfa;
import GUI.EmanettekiKitaplarSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmanettekiKitaplarSayfasiActionListener implements ActionListener{
    private EmanettekiKitaplarSayfasi emanettekiKitaplarSayfasi;
    private EmanetKitapController controller;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == emanettekiKitaplarSayfasi.getListele_butonu()){
            
            try {
                ArrayList<EmanetKitap> emanetler = getController().getDao().getEmanettekiKitaplar();
                
                int i = 0;
                
                while(i != emanetler.size()){
                    String[] data = emanetler.get(i).toString().split(";");
                    emanettekiKitaplarSayfasi.getModel().addRow(data);
                    i++;
                }
                
            } catch (IOException ex) {
                Logger.getLogger(EmanettekiKitaplarSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(EmanettekiKitaplarSayfasiActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if(e.getSource() == emanettekiKitaplarSayfasi.getAnasayfa_butonu()){
            AnaPencere.build(new AnaSayfa());
        }
        
    }

    public EmanettekiKitaplarSayfasiActionListener(EmanettekiKitaplarSayfasi emanettekiKitaplarSayfasi) {
        this.emanettekiKitaplarSayfasi = emanettekiKitaplarSayfasi;
    }

    public EmanettekiKitaplarSayfasi getEmanettekiKitaplarSayfasi() {
        if(this.emanettekiKitaplarSayfasi == null){
            emanettekiKitaplarSayfasi = new EmanettekiKitaplarSayfasi();
        }
        return emanettekiKitaplarSayfasi;
    }

    public void setEmanettekiKitaplarSayfasi(EmanettekiKitaplarSayfasi emanettekiKitaplarSayfasi) {
        this.emanettekiKitaplarSayfasi = emanettekiKitaplarSayfasi;
    }

    public EmanetKitapController getController() {
        if(this.controller == null){
            controller = new EmanetKitapController();
        }
        return controller;
    }

    public void setController(EmanetKitapController controller) {
        this.controller = controller;
    }

    
    
    
    
    
}
