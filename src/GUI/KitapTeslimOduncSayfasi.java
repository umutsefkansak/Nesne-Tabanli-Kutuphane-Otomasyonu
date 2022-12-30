
package GUI;

import Controller.action.KitapTeslimOduncSayfasiActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class KitapTeslimOduncSayfasi implements IDefaultSayfa{
    
    private JPanel panel;
    
    
    private JButton anasayfa_butonu;
    private JButton kitap_odunc_ver_butonu;
    private JButton kitap_teslim_et_butonu;
    
    private JLabel arkaplan;
    private JLabel anasayfa_yazisi;
    private JLabel agac_resmi;

    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 750, 600);
            panel.add(getAnasayfa_butonu());
            panel.add(getKitap_odunc_ver_butonu());
            panel.add(getKitap_teslim_et_butonu());
            panel.add(getAnasayfa_yazisi());
            panel.add(getAgac_resmi());
            panel.add(getArkaplan());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getAnasayfa_butonu() {
        if(this.anasayfa_butonu == null){
            anasayfa_butonu = new JButton();
            anasayfa_butonu.setBounds(15, 200, 150, 130);
            anasayfa_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));  
            anasayfa_butonu.addActionListener(new KitapTeslimOduncSayfasiActionListener(this));
        }
        return anasayfa_butonu;
    }

    public void setAnasayfa_butonu(JButton anasayfa_butonu) {
        this.anasayfa_butonu = anasayfa_butonu;
    }

    public JButton getKitap_odunc_ver_butonu() {
        if(this.kitap_odunc_ver_butonu == null){
            kitap_odunc_ver_butonu = new JButton("Kitap Ödünç Ver");
            kitap_odunc_ver_butonu.setBounds(300, 380, 140, 60);
            kitap_odunc_ver_butonu.addActionListener(new KitapTeslimOduncSayfasiActionListener(this));
        }
        return kitap_odunc_ver_butonu;
    }

    public void setKitap_odunc_ver_butonu(JButton kitap_odunc_ver_butonu) {
        this.kitap_odunc_ver_butonu = kitap_odunc_ver_butonu;
    }

    public JButton getKitap_teslim_et_butonu() {
        if(this.kitap_teslim_et_butonu == null){
            kitap_teslim_et_butonu = new JButton("Kitap Teslim Et");
            kitap_teslim_et_butonu.setBounds(470, 380, 140, 60);
            kitap_teslim_et_butonu.addActionListener(new KitapTeslimOduncSayfasiActionListener(this));
        }
        return kitap_teslim_et_butonu;
    }

    public void setKitap_teslim_et_butonu(JButton kitap_teslim_et_butonu) {
        this.kitap_teslim_et_butonu = kitap_teslim_et_butonu;
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

    public JLabel getAgac_resmi() {
        if(this.agac_resmi == null){
            agac_resmi = new JLabel();
            agac_resmi.setBounds(320, 10, 310, 360);
            agac_resmi.setIcon(new ImageIcon(getClass().getResource("/Images/KitapAgaci.png")));
        }
        return agac_resmi;
    }

    public void setAgac_resmi(JLabel agac_resmi) {
        this.agac_resmi = agac_resmi;
    }
    
    
}
