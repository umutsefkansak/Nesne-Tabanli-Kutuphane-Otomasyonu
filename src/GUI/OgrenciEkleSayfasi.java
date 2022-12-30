
package GUI;

import Controller.action.OgrenciEkleSayfasiActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OgrenciEkleSayfasi implements IDefaultSayfa{
    
    private JPanel panel;
   
    private JTextField adi_alani;
    private JTextField soyadi_alani;
    private JTextField tc_alani;
    private JTextField tel_alani;
    
    private JButton anasayfa_butonu;
    private JButton ogrenci_ekle_butonu;
    
    private JLabel adi_yazisi;
    private JLabel soyadi_yazisi;
    private JLabel tc_yazisi;
    private JLabel tel_yazisi;
    private JLabel anasayfa_yazisi;
    private JLabel arkaplan;
    
    
    
    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 750, 600);
            panel.add(getAdi_alani());
            panel.add(getSoyadi_alani());
            panel.add(getTc_alani());
            panel.add(getTel_alani());
            panel.add(getAnasayfa_butonu());
            panel.add(getOgrenci_ekle_butonu());
            panel.add(getAdi_yazisi());
            panel.add(getSoyadi_yazisi());
            panel.add(getTc_yazisi());
            panel.add(getTel_yazisi());
            panel.add(getAnasayfa_yazisi());
            panel.add(getArkaplan());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getAdi_alani() {
        if(this.adi_alani == null){
            adi_alani = new JTextField();
            adi_alani.setBounds(350, 140, 200, 30);
        }
        return adi_alani;
    }

    public void setAdi_alani(JTextField adi_alani) {
        this.adi_alani = adi_alani;
    }

    public JTextField getSoyadi_alani() {
        if(this.soyadi_alani == null){
            soyadi_alani = new JTextField();
            soyadi_alani.setBounds(350, 180, 200, 30);
        }
        return soyadi_alani;
    }

    public void setSoyadi_alani(JTextField soyadi_alani) {
        this.soyadi_alani = soyadi_alani;
    }

    public JTextField getTc_alani() {
        if(this.tc_alani == null){
            tc_alani = new JTextField();
            tc_alani.setBounds(350, 220, 200, 30);
        }
        return tc_alani;
    }

    public void setTc_alani(JTextField tc_alani) {
        this.tc_alani = tc_alani;
    }

    public JTextField getTel_alani() {
        if(this.tel_alani == null){
            tel_alani = new JTextField();
            tel_alani.setBounds(350, 260, 200, 30);
        }
        return tel_alani;
    }

    public void setTel_alani(JTextField tel_alani) {
        this.tel_alani = tel_alani;
    }

    public JButton getAnasayfa_butonu() {
        if(this.anasayfa_butonu == null){
            anasayfa_butonu = new JButton();
            anasayfa_butonu.setBounds(15, 200, 150, 130);
            anasayfa_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            anasayfa_butonu.addActionListener(new OgrenciEkleSayfasiActionListener(this));
        }
        return anasayfa_butonu;
    }

    public void setAnasayfa_butonu(JButton anasayfa_butonu) {
        this.anasayfa_butonu = anasayfa_butonu;
    }

    public JButton getOgrenci_ekle_butonu() {
        if(this.ogrenci_ekle_butonu == null){
            ogrenci_ekle_butonu = new JButton("Öğrenci Ekle");
            ogrenci_ekle_butonu.setBounds(370, 310, 150, 30);
            ogrenci_ekle_butonu.addActionListener(new OgrenciEkleSayfasiActionListener(this));
        }
        return ogrenci_ekle_butonu;
    }

    public void setOgrenci_ekle_butonu(JButton ogrenci_ekle_butonu) {
        this.ogrenci_ekle_butonu = ogrenci_ekle_butonu;
    }
    
    
    
    
    
    

    public JLabel getAdi_yazisi() {
        if(this.adi_yazisi == null){
            adi_yazisi = new JLabel();
            adi_yazisi.setText("Adı :");
            adi_yazisi.setBounds(305, 140, 50, 30);
            adi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return adi_yazisi;
    }

    public void setAdi_yazisi(JLabel adi_yazisi) {
        this.adi_yazisi = adi_yazisi;
    }

    public JLabel getSoyadi_yazisi() {
        if(this.soyadi_yazisi == null){
            soyadi_yazisi = new JLabel();
            soyadi_yazisi.setText("Soyadı :");
            soyadi_yazisi.setBounds(280, 180, 70, 30);
            soyadi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return soyadi_yazisi;
    }

    public void setSoyadi_yazisi(JLabel soyadi_yazisi) {
        this.soyadi_yazisi = soyadi_yazisi;
    }

    public JLabel getTc_yazisi() {
        if(this.tc_yazisi == null){
            tc_yazisi = new JLabel();
            tc_yazisi.setText("T.C No :");
            tc_yazisi.setBounds(280, 220, 70, 30);
            tc_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return tc_yazisi;
    }

    public void setTc_yazisi(JLabel tc_yazisi) {
        this.tc_yazisi = tc_yazisi;
    }

    public JLabel getTel_yazisi() {
        if(this.tel_yazisi == null){
            tel_yazisi = new JLabel();
            tel_yazisi.setText("Tel No :");
            tel_yazisi.setBounds(280, 260, 70, 30);
            tel_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return tel_yazisi;
    }

    public void setTel_yazisi(JLabel tel_yazisi) {
        this.tel_yazisi = tel_yazisi;
    }

    public JLabel getAnasayfa_yazisi() {
        if(this.anasayfa_yazisi == null){
            anasayfa_yazisi = new JLabel();
            anasayfa_yazisi.setBounds(70, 330, 110, 20);
            anasayfa_yazisi.setText("Geri");
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
    
    
    
}
