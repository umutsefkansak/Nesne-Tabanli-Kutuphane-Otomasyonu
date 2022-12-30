
package GUI;

import Controller.action.KitapTeslimEtSayfasiActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class KitapTeslimEtSayfasi implements IDefaultSayfa{
    
    private JPanel panel ;
    
    private JTextField emanet_id_alani;
    private JTextField geciktirdigi_gun_alani;
    private JTextField odedigi_tutar_alani;
    
    private JButton geri_butonu;
    private JButton kitabi_teslim_et_butonu;
    
    
    private JLabel emanet_id_yazisi;
    private JLabel geciktirdigi_gun_yazisi;
    private JLabel odedigi_tutar_yazisi;
    private JLabel geri_yazisi;
    private JLabel arkaplan;

    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 750, 600);
            
            panel.add(getEmanet_id_alani());
            panel.add(getGeciktirdigi_gun_alani());
            panel.add(getOdedigi_tutar_alani());
            
            panel.add(getGeri_butonu());
            panel.add(getKitabi_teslim_et_butonu());
            
            panel.add(getEmanet_id_yazisi());
            panel.add(getGeciktirdigi_gun_yazisi());
            panel.add(getOdedigi_tutar_yazisi());
            panel.add(getGeri_yazisi());
            panel.add(getArkaplan());
            
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getEmanet_id_alani() {
        
        if(this.emanet_id_alani == null){
            emanet_id_alani = new JTextField();
            emanet_id_alani.setBounds(500, 230, 60, 30);
        }
        return emanet_id_alani;
    }

    public void setEmanet_id_alani(JTextField emanet_id_alani) {
        this.emanet_id_alani = emanet_id_alani;
    }

    public JTextField getGeciktirdigi_gun_alani() {
        if(this.geciktirdigi_gun_alani == null){
            geciktirdigi_gun_alani = new JTextField();
            geciktirdigi_gun_alani.setBounds(500, 280, 60, 30);
        }
        return geciktirdigi_gun_alani;
    }

    public void setGeciktirdigi_gun_alani(JTextField geciktirdigi_gun_alani) {
        this.geciktirdigi_gun_alani = geciktirdigi_gun_alani;
    }

    public JTextField getOdedigi_tutar_alani() {
        if(this.odedigi_tutar_alani == null){
            odedigi_tutar_alani = new JTextField();
            odedigi_tutar_alani.setBounds(500, 330, 60, 30);
        }
        return odedigi_tutar_alani;
    }

    public void setOdedigi_tutar_alani(JTextField odedigi_tutar_alani) {
        this.odedigi_tutar_alani = odedigi_tutar_alani;
    }

    public JButton getGeri_butonu() {
        if(this.geri_butonu == null){
            geri_butonu= new JButton();
            geri_butonu.setBounds(20, 190, 150, 130);
            geri_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            geri_butonu.addActionListener(new KitapTeslimEtSayfasiActionListener(this));
        }
        return geri_butonu;
    }

    public void setGeri_butonu(JButton geri_butonu) {
        this.geri_butonu = geri_butonu;
    }

    public JButton getKitabi_teslim_et_butonu() {
        if(this.kitabi_teslim_et_butonu == null){
            kitabi_teslim_et_butonu = new JButton("Kitabı Teslim Et");
            kitabi_teslim_et_butonu.setBounds(400, 390, 130, 40);
            kitabi_teslim_et_butonu.addActionListener(new KitapTeslimEtSayfasiActionListener(this));
        }
        return kitabi_teslim_et_butonu;
    }

    public void setKitabi_teslim_et_butonu(JButton kitabi_teslim_et_butonu) {
        this.kitabi_teslim_et_butonu = kitabi_teslim_et_butonu;
    }
    
    public JLabel getEmanet_id_yazisi() {
        if(this.emanet_id_yazisi == null){
            emanet_id_yazisi = new JLabel();
            emanet_id_yazisi.setText("Emanetteki Kitap Id :");
            emanet_id_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            emanet_id_yazisi.setBounds(330, 230, 170, 30);
        }
        return emanet_id_yazisi;
    }

    public void setEmanet_id_yazisi(JLabel emanet_id_yazisi) {
        this.emanet_id_yazisi = emanet_id_yazisi;
    }

    public JLabel getGeciktirdigi_gun_yazisi() {
        if(this.geciktirdigi_gun_yazisi == null){
            geciktirdigi_gun_yazisi = new JLabel();
            geciktirdigi_gun_yazisi.setText("Geciktirdiği Gün Sayısı :");
            geciktirdigi_gun_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            geciktirdigi_gun_yazisi.setBounds(310, 280, 180, 30);
        }
        return geciktirdigi_gun_yazisi;
    }

    public void setGeciktirdigi_gun_yazisi(JLabel geciktirdigi_gun_yazisi) {
        this.geciktirdigi_gun_yazisi = geciktirdigi_gun_yazisi;
    }

    public JLabel getOdedigi_tutar_yazisi() {
        if(this.odedigi_tutar_yazisi == null){
            odedigi_tutar_yazisi = new JLabel();
            odedigi_tutar_yazisi.setText("Ödediği Tutar :");
            odedigi_tutar_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            odedigi_tutar_yazisi.setBounds(370, 330, 120, 30);
        }
        return odedigi_tutar_yazisi;
    }

    public void setOdedigi_tutar_yazisi(JLabel odedigi_tutar_yazisi) {
        this.odedigi_tutar_yazisi = odedigi_tutar_yazisi;
    }

    public JLabel getGeri_yazisi() {
         if(this.geri_yazisi == null){
            geri_yazisi = new JLabel();
            geri_yazisi.setBounds(70, 330, 110, 20);
            geri_yazisi.setText("Geri");
            geri_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
        }
        return geri_yazisi;
    }

    public void setGeri_yazisi(JLabel geri_yazisi) {
        this.geri_yazisi = geri_yazisi;
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
