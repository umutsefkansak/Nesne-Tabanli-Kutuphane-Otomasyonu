package GUI;

import Controller.action.AnaSayfaActionListener;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnaSayfa implements IDefaultSayfa {

    private JPanel panel;

    private JButton kitap_listesi_butonu;
    private JButton kitap_ekle_butonu;
    private JButton emanetteki_kitaplar_butonu;
    private JButton kitap_islemleri_butonu;
    private JButton ogrenci_islemleri_butonu;
    private JButton cikis_butonu;

    private JLabel arkaplan_foto;
    private JLabel sol_foto;
    private JLabel yazi;
    private JLabel Kitap_listesi_yazisi;
    private JLabel kitap_ekle_yazisi;
    private JLabel emanet_kitaplar_listesi_yazisi;
    private JLabel kitap_teslim_odunc_yazisi;
    private JLabel ogrenci_listesi_yazisi;
    private JLabel cikis_yazisi;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            panel.setBounds(0, 0, 750, 600);
            panel.setLayout(null);

            panel.add(getKitap_listesi_yazisi());
            panel.add(getKitap_ekle_yazisi());
            panel.add(getKitap_teslim_odunc_yazisi());
            panel.add(getEmanet_kitaplar_listesi_yazisi());
            panel.add(getOgrenci_listesi_yazisi());
            panel.add(getCikis_yazisi());
            panel.add(getYazi());

            panel.add(getSol_foto());
            panel.add(getKitap_listesi_butonu());
            panel.add(getKitap_ekle_butonu());
            panel.add(getEmanetteki_kitaplar_butonu());
            panel.add(getKitap_islemleri_butonu());
            panel.add(getOgrenci_islemleri_butonu());
            panel.add(getCikis_butonu());
            panel.add(getArkaplan_foto());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getKitap_listesi_butonu() {
        if (this.kitap_listesi_butonu == null) {
            kitap_listesi_butonu = new JButton();
            kitap_listesi_butonu.setBounds(360, 40, 150, 130);
            kitap_listesi_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/KitapListesi.png")));
            kitap_listesi_butonu.setVerticalAlignment(3);
            kitap_listesi_butonu.addActionListener(new AnaSayfaActionListener(this));
        }
        return kitap_listesi_butonu;
    }

    public void setKitap_listesi_butonu(JButton kitap_listesi_butonu) {
        this.kitap_listesi_butonu = kitap_listesi_butonu;
    }

    public JButton getKitap_ekle_butonu() {
        if (this.kitap_ekle_butonu == null) {
            kitap_ekle_butonu = new JButton();
            kitap_ekle_butonu.setBounds(540, 40, 150, 130);
            kitap_ekle_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/KitapEkle.png")));
            kitap_ekle_butonu.addActionListener(new AnaSayfaActionListener(this));

        }
        return kitap_ekle_butonu;
    }

    public void setKitap_ekle_butonu(JButton kitap_ekle_butonu) {
        this.kitap_ekle_butonu = kitap_ekle_butonu;
    }

    public JButton getEmanetteki_kitaplar_butonu() {
        if (this.emanetteki_kitaplar_butonu == null) {
            emanetteki_kitaplar_butonu = new JButton();
            emanetteki_kitaplar_butonu.setBounds(540, 220, 150, 130);
            emanetteki_kitaplar_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            emanetteki_kitaplar_butonu.addActionListener(new AnaSayfaActionListener(this));
        }
        return emanetteki_kitaplar_butonu;
    }

    public void setEmanetteki_kitaplar_butonu(JButton emanetteki_kitaplar_butonu) {
        this.emanetteki_kitaplar_butonu = emanetteki_kitaplar_butonu;
    }

    public JButton getKitap_islemleri_butonu() {
        if (this.kitap_islemleri_butonu == null) {
            kitap_islemleri_butonu = new JButton();
            kitap_islemleri_butonu.setBounds(360, 220, 150, 130);
            kitap_islemleri_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/KitapOduncAl.png")));
            kitap_islemleri_butonu.addActionListener(new AnaSayfaActionListener(this));

        }
        return kitap_islemleri_butonu;
    }

    public void setKitap_islemleri_butonu(JButton kitap_islemleri_butonu) {
        this.kitap_islemleri_butonu = kitap_islemleri_butonu;
    }

    public JButton getOgrenci_islemleri_butonu() {
        if (this.ogrenci_islemleri_butonu == null) {
            ogrenci_islemleri_butonu = new JButton();
            ogrenci_islemleri_butonu.setBounds(360, 400, 150, 130);
            ogrenci_islemleri_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/OgrenciListesi.png")));
            ogrenci_islemleri_butonu.addActionListener(new AnaSayfaActionListener(this));
        }
        return ogrenci_islemleri_butonu;
    }

    public void setOgrenci_islemleri_butonu(JButton ogrenci_islemleri_butonu) {
        this.ogrenci_islemleri_butonu = ogrenci_islemleri_butonu;
    }

    public JButton getCikis_butonu() {
        if (this.cikis_butonu == null) {
            cikis_butonu = new JButton();
            cikis_butonu.setBounds(540, 400, 150, 130);
            cikis_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/Cikis.png")));
            cikis_butonu.addActionListener(new AnaSayfaActionListener(this));

        }
        return cikis_butonu;
    }

    public void setCikis_butonu(JButton cikis_butonu) {
        this.cikis_butonu = cikis_butonu;
    }

    public JLabel getArkaplan_foto() {
        if (this.arkaplan_foto == null) {
            arkaplan_foto = new JLabel();
            arkaplan_foto.setBounds(0, 0, 750, 600);
            Image foto = new ImageIcon(getClass().getResource("/Images/arkaplan2.png")).getImage();
            arkaplan_foto.setIcon(new ImageIcon(foto));
        }
        return arkaplan_foto;
    }

    public void setArkaplan_foto(JLabel arkaplan_foto) {
        this.arkaplan_foto = arkaplan_foto;
    }

    public JLabel getYazi() {
        if (this.yazi == null) {
            yazi = new JLabel();
            yazi.setBounds(40, 420, 270, 40);
            yazi.setText("İnönü Üniversitesi");
            yazi.setFont(new Font("Segoe Print", Font.BOLD, 20));
        }
        return yazi;
    }

    public void setYazi(JLabel yazi) {
        this.yazi = yazi;
    }

    public JLabel getSol_foto() {
        if (this.sol_foto == null) {
            sol_foto = new JLabel();
            sol_foto.setBounds(-10, 90, 290, 320);
            Image foto = new ImageIcon(getClass().getResource("/Images/KitapRafi.png")).getImage();
            sol_foto.setIcon(new ImageIcon(foto));
        }
        return sol_foto;
    }

    public void setSol_foto(JLabel sol_foto) {
        this.sol_foto = sol_foto;
    }

    public JLabel getKitap_listesi_yazisi() {
        if (this.Kitap_listesi_yazisi == null) {
            Kitap_listesi_yazisi = new JLabel();
            Kitap_listesi_yazisi.setText("Kitap Listesi");
            Kitap_listesi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            Kitap_listesi_yazisi.setBounds(390, 170, 110, 20);
        }
        return Kitap_listesi_yazisi;
    }

    public void setKitap_listesi_yazisi(JLabel Kitap_listesi_yazisi) {
        this.Kitap_listesi_yazisi = Kitap_listesi_yazisi;
    }

    public JLabel getKitap_ekle_yazisi() {
        if (this.kitap_ekle_yazisi == null) {
            kitap_ekle_yazisi = new JLabel();
            kitap_ekle_yazisi.setText("Kitap Ekle");
            kitap_ekle_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            kitap_ekle_yazisi.setBounds(580, 170, 110, 20);
        }
        return kitap_ekle_yazisi;
    }

    public void setKitap_ekle_yazisi(JLabel kitap_ekle_yazisi) {
        this.kitap_ekle_yazisi = kitap_ekle_yazisi;
    }

    public JLabel getEmanet_kitaplar_listesi_yazisi() {
        if (this.emanet_kitaplar_listesi_yazisi == null) {
            emanet_kitaplar_listesi_yazisi = new JLabel();
            emanet_kitaplar_listesi_yazisi.setText("Emanetteki Kitaplar");
            emanet_kitaplar_listesi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            emanet_kitaplar_listesi_yazisi.setBounds(540, 350, 160, 20);
        }
        return emanet_kitaplar_listesi_yazisi;
    }

    public void setEmanet_kitaplar_listesi_yazisi(JLabel emanet_kitaplar_listesi_yazisi) {
        this.emanet_kitaplar_listesi_yazisi = emanet_kitaplar_listesi_yazisi;
    }

    public JLabel getKitap_teslim_odunc_yazisi() {
        if (this.kitap_teslim_odunc_yazisi == null) {
            kitap_teslim_odunc_yazisi = new JLabel();
            kitap_teslim_odunc_yazisi.setText("Kitap Teslim - Ödünç");
            kitap_teslim_odunc_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            kitap_teslim_odunc_yazisi.setBounds(360, 350, 160, 20);
        }
        return kitap_teslim_odunc_yazisi;
    }

    public void setKitap_teslim_odunc_yazisi(JLabel kitap_teslim_odunc_yazisi) {
        this.kitap_teslim_odunc_yazisi = kitap_teslim_odunc_yazisi;
    }

    public JLabel getOgrenci_listesi_yazisi() {
        if (this.ogrenci_listesi_yazisi == null) {
            ogrenci_listesi_yazisi = new JLabel();
            ogrenci_listesi_yazisi.setText("Öğrenci İşlemleri");
            ogrenci_listesi_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            ogrenci_listesi_yazisi.setBounds(375, 530, 120, 20);
        }
        return ogrenci_listesi_yazisi;
    }

    public void setOgrenci_listesi_yazisi(JLabel ogrenci_listesi_yazisi) {
        this.ogrenci_listesi_yazisi = ogrenci_listesi_yazisi;
    }

    public JLabel getCikis_yazisi() {
        if (this.cikis_yazisi == null) {
            cikis_yazisi = new JLabel();
            cikis_yazisi.setText("Çıkış");
            cikis_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            cikis_yazisi.setBounds(600, 530, 60, 20);
        }
        return cikis_yazisi;
    }

    public void setCikis_yazisi(JLabel cikis_yazisi) {
        this.cikis_yazisi = cikis_yazisi;
    }

}
