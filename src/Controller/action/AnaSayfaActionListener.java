package Controller.action;

import GUI.AnaSayfa;
import GUI.EmanettekiKitaplarSayfasi;
import GUI.KitapEkleSayfası;
import GUI.KitapListesiSayfasi;
import GUI.KitapTeslimOduncSayfasi;
import GUI.OgrenciIslemleriSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class AnaSayfaActionListener implements ActionListener {

    private AnaSayfa anaSayfa;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == anaSayfa.getKitap_listesi_butonu()) {
            AnaPencere.build(new KitapListesiSayfasi());
        }
        if (e.getSource() == anaSayfa.getKitap_ekle_butonu()) {
            AnaPencere.build(new KitapEkleSayfası());
        
        }
        if (e.getSource() == anaSayfa.getKitap_islemleri_butonu()) {
            AnaPencere.build(new KitapTeslimOduncSayfasi());

        }
        if (e.getSource() == anaSayfa.getEmanetteki_kitaplar_butonu()) {
            AnaPencere.build(new EmanettekiKitaplarSayfasi());
        }
        if (e.getSource() == anaSayfa.getOgrenci_islemleri_butonu()) {
            AnaPencere.build(new OgrenciIslemleriSayfasi());
        }
        if (e.getSource() == anaSayfa.getCikis_butonu()) {
            AnaPencere.getFrame().dispatchEvent(new WindowEvent(AnaPencere.getFrame(),WindowEvent.WINDOW_CLOSING));
        }
    }

    public AnaSayfaActionListener(AnaSayfa anaSayfa) {
        this.anaSayfa = anaSayfa;
    }

    public AnaSayfa getAnaSayfa() {
        if (this.anaSayfa == null) {
            anaSayfa = new AnaSayfa();
        }
        return anaSayfa;
    }

    public void setAnaSayfa(AnaSayfa anaSayfa) {
        this.anaSayfa = anaSayfa;
    }

}
