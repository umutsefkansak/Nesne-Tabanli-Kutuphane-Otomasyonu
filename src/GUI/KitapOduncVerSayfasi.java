
package GUI;

import Controller.action.KitapOduncVerSayfasiActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KitapOduncVerSayfasi implements IDefaultSayfa{
    private JPanel panel;
    
    private JTextField kitap_id_alani;
    private JTextField ogrenci_id_alani;
    private JTextField alis_tarihi_alani;
    private JTextField teslim_tarihi_alani;
    
    
    private JLabel kitap_id_yazisi;
    private JLabel ogrenci_id_yazisi;
    private JLabel alis_tarihi_yazisi;
    private JLabel teslim_tarihi_yazisi;
    private JLabel anasayfa_yazisi;
    private JLabel arkaplan;
    
    private JButton kitap_odunc_butonu;
    private JButton anasayfa_butonu;

    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 750, 600);
            panel.add(getKitap_id_alani());
            panel.add(getOgrenci_id_alani());
            panel.add(getAlis_tarihi_alani());
            panel.add(getTeslim_tarihi_alani());
            
            panel.add(getKitap_id_yazisi());
            panel.add(getOgrenci_id_yazisi());
            panel.add(getAlis_tarihi_yazisi());
            panel.add(getTeslim_tarihi_yazisi());
            panel.add(getAnasayfa_yazisi());
            
            panel.add(getKitap_odunc_butonu());
            panel.add(getAnasayfa_butonu());
            panel.add(getArkaplan());
               
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getKitap_id_alani() {
        
        if(this.kitap_id_alani == null){
            kitap_id_alani = new JTextField();
            kitap_id_alani.setBounds(420, 130, 60, 30);
        }
        return kitap_id_alani;
    }

    public void setKitap_id_alani(JTextField kitap_id_alani) {
        this.kitap_id_alani = kitap_id_alani;
    }

    public JTextField getOgrenci_id_alani() {
        if(this.ogrenci_id_alani == null){
            ogrenci_id_alani = new JTextField();
            ogrenci_id_alani.setBounds(420, 170, 60, 30);
        }
        return ogrenci_id_alani;
    }

    public void setOgrenci_id_alani(JTextField ogrenci_id_alani) {
        this.ogrenci_id_alani = ogrenci_id_alani;
    }

   

    public JTextField getAlis_tarihi_alani() {
        if(this.alis_tarihi_alani == null){
            alis_tarihi_alani = new JTextField();
            alis_tarihi_alani.setBounds(420, 210, 170, 30);
        }
        return alis_tarihi_alani;
    }

    public void setAlis_tarihi_alani(JTextField alis_tarihi_alani) {
        this.alis_tarihi_alani = alis_tarihi_alani;
    }

    public JTextField getTeslim_tarihi_alani() {
        if(this.teslim_tarihi_alani == null){
            teslim_tarihi_alani = new JTextField();
            teslim_tarihi_alani.setBounds(420, 250, 170, 30);
        }
        return teslim_tarihi_alani;
    }

    public void setTeslim_tarihi_alani(JTextField teslim_tarihi_alani) {
        this.teslim_tarihi_alani = teslim_tarihi_alani;
    }

    public JLabel getKitap_id_yazisi() {
        if(this.kitap_id_yazisi == null){
            kitap_id_yazisi = new JLabel();
            kitap_id_yazisi.setText("Kitap ID :");
            kitap_id_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            kitap_id_yazisi.setBounds(330, 130, 70, 30);
        }
        return kitap_id_yazisi;
    }

    public void setKitap_id_yazisi(JLabel kitap_id_yazisi) {
        this.kitap_id_yazisi = kitap_id_yazisi;
    }

    public JLabel getOgrenci_id_yazisi() {
        if(this.ogrenci_id_yazisi == null){
            ogrenci_id_yazisi = new JLabel();
            ogrenci_id_yazisi.setText("Öğreci Id :");
            ogrenci_id_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            ogrenci_id_yazisi.setBounds(330, 170, 130, 30);
        }
        return ogrenci_id_yazisi;
    }

    public void setOgrenci_id_yazisi(JLabel ogrenci_id_yazisi) {
        this.ogrenci_id_yazisi = ogrenci_id_yazisi;
    }


    public JLabel getAlis_tarihi_yazisi() {
        if(this.alis_tarihi_yazisi == null){
            alis_tarihi_yazisi = new JLabel();
            alis_tarihi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            alis_tarihi_yazisi.setBounds(230, 210, 190, 30);
            alis_tarihi_yazisi.setText("Alış Tarihi (gg/aa/yyyy):");
        }
        return alis_tarihi_yazisi;
    }

    public void setAlis_tarihi_yazisi(JLabel alis_tarihi_yazisi) {
        this.alis_tarihi_yazisi = alis_tarihi_yazisi;
    }

    public JLabel getTeslim_tarihi_yazisi() {
        if(this.teslim_tarihi_yazisi == null){
            teslim_tarihi_yazisi = new JLabel();
            teslim_tarihi_yazisi.setText("Teslim Tarihi (gg/aa/yyyy):");
            teslim_tarihi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            teslim_tarihi_yazisi.setBounds(210, 250, 220, 30);
        }
        return teslim_tarihi_yazisi;
    }

    public void setTeslim_tarihi_yazisi(JLabel teslim_tarihi_yazisi) {
        this.teslim_tarihi_yazisi = teslim_tarihi_yazisi;
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
    
    

    public JButton getKitap_odunc_butonu() {
        if(this.kitap_odunc_butonu == null){
           kitap_odunc_butonu = new JButton("Kitap Ödünç Ver");
           kitap_odunc_butonu.setBounds(430, 300, 130, 40);
           kitap_odunc_butonu.addActionListener(new KitapOduncVerSayfasiActionListener(this));
           
        }
        
        return kitap_odunc_butonu;
    }

    public void setKitap_odunc_butonu(JButton kitap_odunc_butonu) {
        this.kitap_odunc_butonu = kitap_odunc_butonu;
    }

    public JButton getAnasayfa_butonu() {
         if(this.anasayfa_butonu == null){
            anasayfa_butonu = new JButton();
            anasayfa_butonu.setBounds(20, 190, 150, 130);
            anasayfa_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            anasayfa_butonu.addActionListener(new KitapOduncVerSayfasiActionListener(this));
        }
        return anasayfa_butonu;
    }

    public void setAnasayfa_butonu(JButton anasayfa_butonu) {
        this.anasayfa_butonu = anasayfa_butonu;
    }
    
    
}
