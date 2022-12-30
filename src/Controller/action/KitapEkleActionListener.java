package Controller.action;

import Controller.KitapController;
import GUI.AnaSayfa;
import GUI.KitapEkleSayfası;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KitapEkleActionListener implements ActionListener {

    private KitapEkleSayfası kitapEkleSayfası;
    private KitapController controller;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == kitapEkleSayfası.getEkle_butonu()) {

            if (kitapEkleSayfası.getKitap_adi_alani().getText().equals("")
                || kitapEkleSayfası.getYazari_alani().getText().equals("")
                || kitapEkleSayfası.getTuru_alani().getText().equals("")
                || kitapEkleSayfası.getSayfa_sayisi_alani().getText().equals("")
                || kitapEkleSayfası.getStok_sayisi_alani().getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Lütfen Tüm Alanları Doldurunuz!");
            } 
            else {
                
                try {
                    String kitapAdi = kitapEkleSayfası.getKitap_adi_alani().getText();
                    String yazari = kitapEkleSayfası.getYazari_alani().getText();
                    String turu = kitapEkleSayfası.getTuru_alani().getText();
                    int sayfaSayisi = Integer.valueOf(kitapEkleSayfası.getSayfa_sayisi_alani().getText());
                    int stokSayisi = Integer.valueOf(kitapEkleSayfası.getStok_sayisi_alani().getText());
                    getController().create(kitapAdi, yazari, turu, sayfaSayisi, stokSayisi);
                    kitapEkleSayfası.getKitap_adi_alani().setText("");
                    kitapEkleSayfası.getYazari_alani().setText("");
                    kitapEkleSayfası.getTuru_alani().setText("");
                    kitapEkleSayfası.getSayfa_sayisi_alani().setText("");
                    kitapEkleSayfası.getStok_sayisi_alani().setText("");

                    JOptionPane.showMessageDialog(null, "Kitap Başarıyla Eklendi!");
                } catch (IOException ex) {
                    Logger.getLogger(KitapEkleActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        if (e.getSource() == kitapEkleSayfası.getAnasayfa_butonu()) {
            AnaPencere.build(new AnaSayfa());
        }
    }

    public KitapEkleActionListener(KitapEkleSayfası kitapEkleSayfası) {
        this.kitapEkleSayfası = kitapEkleSayfası;
    }

    public KitapEkleSayfası getKitapEkleSayfası() {
        return kitapEkleSayfası;
    }

    public void setKitapEkleSayfası(KitapEkleSayfası kitapEkleSayfası) {
        this.kitapEkleSayfası = kitapEkleSayfası;
    }

    public KitapController getController() {
        if (this.controller == null) {
            this.controller = new KitapController();
        }
        return controller;
    }

    public void setController(KitapController controller) {
        this.controller = controller;
    }

}
