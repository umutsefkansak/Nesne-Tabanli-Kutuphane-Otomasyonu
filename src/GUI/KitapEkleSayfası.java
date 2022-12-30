
package GUI;

import Controller.action.KitapEkleActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class KitapEkleSayfası implements IDefaultSayfa{
    
    private JPanel panel;
    
    private JTextField kitap_adi_alani;
    private JTextField yazari_alani;
    private JTextField turu_alani;
    private JTextField sayfa_sayisi_alani;
    private JTextField stok_sayisi_alani;
    
    private JButton anasayfa_butonu;
    private JButton ekle_butonu;
    
    private JLabel kitap_adi_yazisi;
    private JLabel yazari_yazisi;
    private JLabel turu_yazisi;
    private JLabel sayfa_sayisi_yazisi;
    private JLabel stok_sayisi_yazisi;
    private JLabel anasayfa_yazisi;
    private JLabel arkaplan;
    
    
    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel();
            panel.setLayout(null);
            panel.setBounds(0, 0, 750, 600);
            panel.add(getKitap_adi_alani());
            panel.add(getYazari_alani());
            panel.add(getTuru_alani());
            panel.add(getSayfa_sayisi_alani());
            panel.add(getStok_sayisi_alani());
            
            
            panel.add(getAnasayfa_butonu());
            panel.add(getEkle_butonu());
            
            panel.add(getKitap_adi_yazisi());
            panel.add(getYazari_yazisi());
            panel.add(getTuru_yazisi());
            panel.add(getSayfa_sayisi_yazisi());
            panel.add(getStok_sayisi_yazisi());
            panel.add(getAnasayfa_yazisi());
            
            panel.add(getArkaplan());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    
    public JTextField getKitap_adi_alani() {
        if(this.kitap_adi_alani == null){
            kitap_adi_alani = new JTextField();
            kitap_adi_alani.setBounds(320, 90, 250, 30);
        }
        return kitap_adi_alani;
    }

    public void setKitap_adi_alani(JTextField kitap_adi_alani) {
        this.kitap_adi_alani = kitap_adi_alani;
    }

    public JTextField getYazari_alani() {
        if(this.yazari_alani == null){
            yazari_alani = new JTextField();
            yazari_alani.setBounds(320, 150, 250, 30);
        }
        return yazari_alani;
    }

    public void setYazari_alani(JTextField yazari_alani) {
        this.yazari_alani = yazari_alani;
    }

    public JTextField getTuru_alani() {
        if(this.turu_alani == null){
            turu_alani = new JTextField();
            turu_alani.setBounds(320, 200, 250, 30);
        }
        return turu_alani;
    }

    public void setTuru_alani(JTextField turu_alani) {
        this.turu_alani = turu_alani;
    }

    public JTextField getSayfa_sayisi_alani() {
        if(this.sayfa_sayisi_alani == null){
            sayfa_sayisi_alani = new JTextField();
            sayfa_sayisi_alani.setBounds(340, 250, 70, 30);
        }
        return sayfa_sayisi_alani;
    }

    public void setSayfa_sayisi_alani(JTextField sayfa_sayisi_alani) {
        this.sayfa_sayisi_alani = sayfa_sayisi_alani;
    }

    public JTextField getStok_sayisi_alani() {
        if(this.stok_sayisi_alani == null){
            stok_sayisi_alani = new JTextField();
            stok_sayisi_alani.setBounds(340, 300, 70, 30);
        }
        return stok_sayisi_alani;
    }
    
    
    public void setStok_sayisi_alani(JTextField stok_sayisi_alani) {
        this.stok_sayisi_alani = stok_sayisi_alani;
    }
    
    
    

    public JLabel getKitap_adi_yazisi() {
        if(this.kitap_adi_yazisi == null){
            kitap_adi_yazisi = new JLabel();
            kitap_adi_yazisi.setBounds(230, 90, 90, 30);
            kitap_adi_yazisi.setText("Kitap Adı :");
            kitap_adi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return kitap_adi_yazisi;
    }

    public void setKitap_adi_yazisi(JLabel kitap_adi_yazisi) {
        this.kitap_adi_yazisi = kitap_adi_yazisi;
    }

    public JLabel getYazari_yazisi() {
        if(this.yazari_yazisi == null){
            yazari_yazisi = new JLabel();
            yazari_yazisi.setBounds(250, 150, 70, 30);
            yazari_yazisi.setText("Yazarı :");
            yazari_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return yazari_yazisi;
    }

    public void setYazari_yazisi(JLabel yazari_yazisi) {
        this.yazari_yazisi = yazari_yazisi;
    }

    public JLabel getTuru_yazisi() {
        if(this.turu_yazisi == null){
            turu_yazisi = new JLabel();
            turu_yazisi.setBounds(270, 200, 60, 30);
            turu_yazisi.setText("Türü :");
            turu_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return turu_yazisi;
    }

    public void setTuru_yazisi(JLabel turu_yazisi) {
        this.turu_yazisi = turu_yazisi;
    }

    public JLabel getSayfa_sayisi_yazisi() {
        if(sayfa_sayisi_yazisi == null){
            sayfa_sayisi_yazisi = new JLabel();
            sayfa_sayisi_yazisi.setBounds(230, 250, 110, 30);
            sayfa_sayisi_yazisi.setText("Sayfa Sayısı :");
            sayfa_sayisi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return sayfa_sayisi_yazisi;
    }

    public void setSayfa_sayisi_yazisi(JLabel sayfa_sayisi_yazisi) {
        this.sayfa_sayisi_yazisi = sayfa_sayisi_yazisi;
    }

    public JLabel getStok_sayisi_yazisi() {
        if(this.stok_sayisi_yazisi == null){
            stok_sayisi_yazisi = new JLabel();
            stok_sayisi_yazisi.setBounds(240, 300, 100, 30);
            stok_sayisi_yazisi.setText("Stok Sayısı :");
            stok_sayisi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return stok_sayisi_yazisi;
    }

    public void setStok_sayisi_yazisi(JLabel stok_sayisi_yazisi) {
        this.stok_sayisi_yazisi = stok_sayisi_yazisi;
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
    
    
    
    
    public JButton getAnasayfa_butonu() {
        if(this.anasayfa_butonu == null){
            anasayfa_butonu = new JButton();
            anasayfa_butonu.setBounds(20, 190, 150, 130);
            anasayfa_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            anasayfa_butonu.addActionListener(new KitapEkleActionListener(this));
            
        }
        return anasayfa_butonu;
    }

    public void setAnasayfa_butonu(JButton anasayfa_butonu) {
        this.anasayfa_butonu = anasayfa_butonu;
    }

    public JButton getEkle_butonu() {
        if(this.ekle_butonu == null){
            ekle_butonu = new JButton("Ekle");
            ekle_butonu.setBounds(380, 350, 140, 40);
            ekle_butonu.addActionListener(new KitapEkleActionListener(this));
        }
        return ekle_butonu;
    }

    public void setEkle_butonu(JButton ekle_butonu) {
        this.ekle_butonu = ekle_butonu;
    }
    
}
