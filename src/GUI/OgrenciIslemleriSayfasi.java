
package GUI;

import Controller.action.OgrenciIslemleriActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OgrenciIslemleriSayfasi implements IDefaultSayfa{
    
    private JPanel panel;
    private JButton ogrenci_ekle_butonu;
    private JButton ogrenci_listesi_butonu;
    private JButton anasayfa_butonu;
    
    private JLabel arkaplan;
    private JLabel anasayfa_yazisi;

    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 750, 600);
            panel.add(getOgrenci_ekle_butonu());
            panel.add(getOgrenci_listesi_butonu());
            panel.add(getAnasayfa_butonu());
            panel.add(getAnasayfa_yazisi());
            panel.add(getArkaplan());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    public JButton getOgrenci_ekle_butonu() {
        if(this.ogrenci_ekle_butonu == null){
            ogrenci_ekle_butonu = new JButton("Öğrenci Ekle");
            ogrenci_ekle_butonu.setBounds(380, 190, 150, 90);
            ogrenci_ekle_butonu.addActionListener(new OgrenciIslemleriActionListener(this));
        }
        return ogrenci_ekle_butonu;
    }

    public void setOgrenci_ekle_butonu(JButton ogrenci_ekle_butonu) {
        this.ogrenci_ekle_butonu = ogrenci_ekle_butonu;
    }

    public JButton getOgrenci_listesi_butonu() {
        if(this.ogrenci_listesi_butonu == null){
            this.ogrenci_listesi_butonu = new JButton("Öğrenci Listesi");
            ogrenci_listesi_butonu.setBounds(380, 310, 150, 90);
            ogrenci_listesi_butonu.addActionListener(new OgrenciIslemleriActionListener(this));
        }
        return ogrenci_listesi_butonu;
    }

    public void setOgrenci_listesi_butonu(JButton ogrenci_listesi_butonu) {
        this.ogrenci_listesi_butonu = ogrenci_listesi_butonu;
    }

    public JButton getAnasayfa_butonu() {
        if(this.anasayfa_butonu == null){
            anasayfa_butonu = new JButton();
            anasayfa_butonu.setBounds(15, 200, 150, 130);
            anasayfa_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            anasayfa_butonu.addActionListener(new OgrenciIslemleriActionListener(this));
        }
        return anasayfa_butonu;
    }

    public void setAnasayfa_butonu(JButton anasayfa_butonu) {
        this.anasayfa_butonu = anasayfa_butonu;
    }

    public JLabel getArkaplan() {
        if(this.arkaplan == null){
            arkaplan = new JLabel();
            arkaplan.setBounds(0, 0, 750, 600);
            arkaplan.setIcon(new ImageIcon(getClass().getResource("/Images/arkaplan.png")));
        }
        
        return arkaplan;
    }

    public void setArkaplan(JLabel arkaplan) {
        this.arkaplan = arkaplan;
    }

    public JLabel getAnasayfa_yazisi() {
        if(this.anasayfa_yazisi == null){
            anasayfa_yazisi = new JLabel();
            anasayfa_yazisi.setBounds(50, 330, 110, 20);
            anasayfa_yazisi.setText("Ana Sayfa");
            anasayfa_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return anasayfa_yazisi;
    }

    public void setAnasayfa_yazisi(JLabel anasayfa_yazisi) {
        this.anasayfa_yazisi = anasayfa_yazisi;
    }
    
    
}
