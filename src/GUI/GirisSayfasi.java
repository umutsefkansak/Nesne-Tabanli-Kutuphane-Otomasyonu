
package GUI;

import Controller.action.GirisActionListener;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GirisSayfasi implements IDefaultSayfa{

    private JPanel panel;
    
    private JTextField kullanici_adi_alani;
    private JPasswordField parola_alani;
    private JButton giris_butonu;
    
    private JLabel arkaplan_label;
    private JLabel kullanici_adi_yazisi;
    private JLabel parola_yazisi;
    private JLabel sol_foto;
    private JLabel ust_foto;
    private JLabel yazi;
    
    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel();
            panel.setSize(750, 600);
            panel.setLayout(null);
            panel.add(getSol_foto());
            panel.add(getUst_foto());
            panel.add(getYazi());
            panel.add(getKullanici_adi_alani());
            panel.add(getParola_alani());
            panel.add(getGiris_butonu());
            panel.add(getKullanici_adi_yazisi());
            panel.add(getParola_yazisi());
            panel.add(getArkaplan_label());
            
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    public JLabel getArkaplan_label() {
        if(this.arkaplan_label == null){
            this.arkaplan_label = new JLabel();
            arkaplan_label.setBounds(0, 0, 750, 600);
            Image arkaplanFoto = new ImageIcon(getClass().getResource("/Images/arkaplan.png")).getImage();
            arkaplan_label.setIcon(new ImageIcon(arkaplanFoto));
            
        }
        return arkaplan_label;
    }

    public void setArkaplan_label(JLabel arkaplan_label) {
        this.arkaplan_label = arkaplan_label;
    }
    
    //AKSİYON EKLE
    public JButton getGiris_butonu() {
        if(this.giris_butonu == null){
            giris_butonu = new JButton("Giriş");
            giris_butonu.setBounds(420, 410, 160, 50);
            giris_butonu.addActionListener(new GirisActionListener(this));
        }
        return giris_butonu;
    }

    public void setGiris_butonu(JButton giris_butonu) {
        this.giris_butonu = giris_butonu;
    }

    public JTextField getKullanici_adi_alani() {
        if(this.kullanici_adi_alani == null){
            kullanici_adi_alani = new JTextField();
            kullanici_adi_alani.setBounds(370, 310, 250, 30);
        }
        return kullanici_adi_alani;
    }

    public void setKullanici_adi_alani(JTextField kullanici_adi_alani) {
        this.kullanici_adi_alani = kullanici_adi_alani;
    }

    public JPasswordField getParola_alani() {
        if(this.parola_alani == null){
            parola_alani = new JPasswordField();
            parola_alani.setBounds(370, 360, 250, 30);
        }
        return parola_alani;
    }

    public void setParola_alani(JPasswordField parola_alani) {
        this.parola_alani = parola_alani;
    }

    public JLabel getKullanici_adi_yazisi() {
        if(this.kullanici_adi_yazisi == null){
            kullanici_adi_yazisi = new JLabel();
            kullanici_adi_yazisi.setText("Kullanıcı Adı : ");
            kullanici_adi_yazisi.setBounds(290, 310, 100, 30);
        }
        return kullanici_adi_yazisi;
    }

    public void setKullanici_adi_yazisi(JLabel kullanici_adi_yazisi) {
        this.kullanici_adi_yazisi = kullanici_adi_yazisi;
    }

    public JLabel getParola_yazisi() {
        if(this.parola_yazisi == null){
            parola_yazisi = new JLabel();
            parola_yazisi.setText("Parola : ");
            parola_yazisi.setBounds(320, 360, 60, 30);
        }
        return parola_yazisi;
    }

    public void setParola_yazisi(JLabel parola_yazisi) {
        this.parola_yazisi = parola_yazisi;
    }

    public JLabel getSol_foto() {
        if(this.sol_foto == null){
            sol_foto = new JLabel();
            sol_foto.setBounds(0, 200, 190, 190);
            Image solFoto = new ImageIcon(getClass().getResource("/Images/GirisSol.png")).getImage();
            sol_foto.setIcon(new ImageIcon(solFoto));
        }
        return sol_foto;
    }

    public void setSol_foto(JLabel sol_foto) {
        this.sol_foto = sol_foto;
    }

    public JLabel getUst_foto() {
        if(this.ust_foto == null){
            ust_foto = new JLabel();
            ust_foto.setBounds(410, 100, 110, 90);
           
            Image ustFoto = new ImageIcon(getClass().getResource("/Images/GirisUst.png")).getImage();
            ust_foto.setIcon(new ImageIcon(ustFoto));
        }
        return ust_foto;
    }

    public void setUst_foto(JLabel ust_foto) {
        this.ust_foto = ust_foto;
    }

    public JLabel getYazi() {
        if(this.yazi == null){
            yazi = new JLabel();
            yazi.setText("'İnsanların aynası kitaplardır.'");
            yazi.setFont(new Font("Segoe Print", Font.BOLD, 12));
            yazi.setBounds(380, 190, 190, 30);
        }
        return yazi;
    }

    public void setYazi(JLabel yazi) {
        this.yazi = yazi;
    }

    
    
}
