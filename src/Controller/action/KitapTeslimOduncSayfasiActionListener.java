
package Controller.action;

import GUI.AnaSayfa;
import GUI.KitapOduncVerSayfasi;
import GUI.KitapTeslimEtSayfasi;
import GUI.KitapTeslimOduncSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapTeslimOduncSayfasiActionListener implements ActionListener{

    private KitapTeslimOduncSayfasi kitapTeslimOduncSayfasi;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getKitapTeslimOduncSayfasi().getAnasayfa_butonu()){
            AnaPencere.build(new AnaSayfa());
        }
        if(e.getSource() == getKitapTeslimOduncSayfasi().getKitap_odunc_ver_butonu()){
            AnaPencere.build(new KitapOduncVerSayfasi());
            
        }
        if(e.getSource() == getKitapTeslimOduncSayfasi().getKitap_teslim_et_butonu()){
            AnaPencere.build(new KitapTeslimEtSayfasi());
        }

    }

    public KitapTeslimOduncSayfasiActionListener(KitapTeslimOduncSayfasi kitapTeslimOduncSayfasi) {
        this.kitapTeslimOduncSayfasi = kitapTeslimOduncSayfasi;
    }

    public KitapTeslimOduncSayfasi getKitapTeslimOduncSayfasi() {
        return kitapTeslimOduncSayfasi;
    }

    public void setKitapTeslimOduncSayfasi(KitapTeslimOduncSayfasi kitapTeslimOduncSayfasi) {
        this.kitapTeslimOduncSayfasi = kitapTeslimOduncSayfasi;
    }
    
    
    
    
    
    
    
    
    
}
