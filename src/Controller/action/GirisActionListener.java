package Controller.action;

import Controller.PersonelController;
import Entity.Personel;
import GUI.AnaSayfa;
import GUI.GirisSayfasi;
import GUI.pencere.AnaPencere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GirisActionListener implements ActionListener {

    GirisSayfasi girisSayfasi;

    public GirisActionListener(GirisSayfasi girisSayfasi) {
        this.girisSayfasi = girisSayfasi;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == girisSayfasi.getGiris_butonu()) {
            try {
                PersonelController pc = new PersonelController();
                ArrayList<Personel> personeller = pc.getDao().getPersoneller();
                int i = 0;
                boolean girisYapildiMi = false;
                String girilenBilgiler = girisSayfasi.getKullanici_adi_alani().getText() + ";" + girisSayfasi.getParola_alani().getText() + ";";

                while (i != personeller.size()) {

                    if (girilenBilgiler.equals(personeller.get(i).toString())) {
                        girisYapildiMi = true;
                        JOptionPane.showMessageDialog(null, "Giriş Başarılı!");
                        AnaPencere.build(new AnaSayfa());
                        break;
                    } else {
                        i++;
                    }
                }

                if (!girisYapildiMi) {
                    JOptionPane.showMessageDialog(null, "Girilen Bilgiler Yanlış!");
                    i = 0;
                }

            } catch (IOException ex) {
                Logger.getLogger(GirisActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
