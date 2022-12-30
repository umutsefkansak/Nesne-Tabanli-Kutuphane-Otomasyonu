
package GUI;

import Controller.action.EmanettekiKitaplarSayfasiActionListener;
import Controller.key.EmanetKitaplarListesiKeyListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class EmanettekiKitaplarSayfasi implements IDefaultSayfa{
    private JPanel panel;
    private JButton listele_butonu;
    private JButton anasayfa_butonu;
    private JTable emanetteki_kitaplar_tablosu;
    private DefaultTableModel model;
    private JScrollPane scrool;
    private JLabel arkaplan;
    private JLabel anasayfa_yazisi;
    private JLabel ara_yazisi;
    
    private JTextField arama_cubugu;
    

    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 750, 600);
            panel.add(getScrool());
            panel.add(getListele_butonu());
            panel.add(getAnasayfa_butonu());
            panel.add(getAnasayfa_yazisi());
            panel.add(getAra_yazisi());
            panel.add(getArama_cubugu());
            panel.add(getArkaplan());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    public JButton getListele_butonu() {
        if(this.listele_butonu == null){
            listele_butonu = new JButton("Listele");
            listele_butonu.setBounds(595, 90, 90, 30);
            listele_butonu.addActionListener(new EmanettekiKitaplarSayfasiActionListener(this));

        }
        return listele_butonu;
    }

    public void setListele_butonu(JButton listele_butonu) {
        this.listele_butonu = listele_butonu;
    }

    public JButton getAnasayfa_butonu() {
        if(this.anasayfa_butonu == null){
            anasayfa_butonu = new JButton();
            anasayfa_butonu.setBounds(15, 200, 150, 130);
            anasayfa_butonu.setIcon(new ImageIcon(getClass().getResource("/Images/EmanettekiKitaplar.png")));
            anasayfa_butonu.addActionListener(new EmanettekiKitaplarSayfasiActionListener(this));

        }
        return anasayfa_butonu;
    }

    public void setAnasayfa_butonu(JButton anasayfa_butonu) {
        this.anasayfa_butonu = anasayfa_butonu;
    }

    public JTable getEmanetteki_kitaplar_tablosu() {
        if(this.emanetteki_kitaplar_tablosu == null){
            String[] kolonlar = {"Id","Adı","Yazarı","Türü","Sayfa Sayısı","Alan Öğrenci","Alış Tar.","Teslim Tar."}; 
            emanetteki_kitaplar_tablosu = new JTable(getModel());
            getModel().setColumnIdentifiers(kolonlar);
            emanetteki_kitaplar_tablosu.setBounds(190, 130, 530, 430);
           
        }
        return emanetteki_kitaplar_tablosu;
    }

    public void setEmanetteki_kitaplar_tablosu(JTable emanetteki_kitaplar_tablosu) {
        this.emanetteki_kitaplar_tablosu = emanetteki_kitaplar_tablosu;
    }

    public DefaultTableModel getModel() {
        if(this.model == null){
            model = new DefaultTableModel();
        }
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JScrollPane getScrool() {
        if(this.scrool == null){
            scrool = new JScrollPane(getEmanetteki_kitaplar_tablosu());
            scrool.setBounds(getEmanetteki_kitaplar_tablosu().getBounds());
        }
        return scrool;
    }

    public void setScrool(JScrollPane scrool) {
        this.scrool = scrool;
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

    public JLabel getAra_yazisi() {
        if(this.ara_yazisi == null){
            ara_yazisi = new JLabel();
            ara_yazisi.setText("Ara :");
            ara_yazisi.setFont(new Font("Segoe Print", Font.PLAIN, 14));
            ara_yazisi.setBounds(270, 50, 40, 30);
        }
        return ara_yazisi;
    }

    public void setAra_yazisi(JLabel ara_yazisi) {
        this.ara_yazisi = ara_yazisi;
    }

    public JTextField getArama_cubugu() {
        if(this.arama_cubugu == null){
            arama_cubugu = new JTextField();
            arama_cubugu.setBounds(320, 50, 360, 30);
            arama_cubugu.addKeyListener(new EmanetKitaplarListesiKeyListener(this));
        }
        
        
        return arama_cubugu;
    }

    public void setArama_cubugu(JTextField arama_cubugu) {
        this.arama_cubugu = arama_cubugu;
    }
    
    
}
