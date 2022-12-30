
package Controller.action;

import GUI.AnaSayfa;
import GUI.OgrenciEkleSayfasi;
import GUI.OgrenciIslemleriSayfasi;
import GUI.OgrenciListesiSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OgrenciIslemleriActionListener implements ActionListener{
    private OgrenciIslemleriSayfasi ogrenciIslemleriSayfasi;

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getOgrenciIslemleriSayfasi().getAnasayfa_butonu()){
            AnaPencere.build(new AnaSayfa());
        }
        if(e.getSource() == getOgrenciIslemleriSayfasi().getOgrenci_ekle_butonu()){
            AnaPencere.build(new OgrenciEkleSayfasi());
        }
        if(e.getSource() == getOgrenciIslemleriSayfasi().getOgrenci_listesi_butonu()){
            AnaPencere.build(new OgrenciListesiSayfasi());
        }
    }

    public OgrenciIslemleriActionListener(OgrenciIslemleriSayfasi ogrenciIslemleriSayfasi) {
        this.ogrenciIslemleriSayfasi = ogrenciIslemleriSayfasi;
    }

    public OgrenciIslemleriSayfasi getOgrenciIslemleriSayfasi() {
        if(this.ogrenciIslemleriSayfasi == null){
            this.ogrenciIslemleriSayfasi = new OgrenciIslemleriSayfasi();
        }
        return ogrenciIslemleriSayfasi;
    }

    public void setOgrenciIslemleriSayfasi(OgrenciIslemleriSayfasi ogrenciIslemleriSayfasi) {
        this.ogrenciIslemleriSayfasi = ogrenciIslemleriSayfasi;
    }
    
    
}
