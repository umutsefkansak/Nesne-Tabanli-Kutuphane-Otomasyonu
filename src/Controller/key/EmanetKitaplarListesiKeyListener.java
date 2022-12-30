
package Controller.key;

import GUI.EmanettekiKitaplarSayfasi;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EmanetKitaplarListesiKeyListener implements KeyListener{
    
    private EmanettekiKitaplarSayfasi emanettekiKitaplarSayfasi;
    
    
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == getEmanettekiKitaplarSayfasi().getArama_cubugu()){
            String ara = getEmanettekiKitaplarSayfasi().getArama_cubugu().getText();
            DinamikAra(ara);
        }
    }
    
    
    public void DinamikAra(String ara){
         TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(getEmanettekiKitaplarSayfasi().getModel());
        getEmanettekiKitaplarSayfasi().getEmanetteki_kitaplar_tablosu().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    
    public EmanetKitaplarListesiKeyListener(EmanettekiKitaplarSayfasi emanettekiKitaplarSayfasi) {
        this.emanettekiKitaplarSayfasi = emanettekiKitaplarSayfasi;
    }

    public EmanettekiKitaplarSayfasi getEmanettekiKitaplarSayfasi() {
        if(this.emanettekiKitaplarSayfasi == null){
            emanettekiKitaplarSayfasi = new EmanettekiKitaplarSayfasi();
        }
        return emanettekiKitaplarSayfasi;
    }

    public void setEmanettekiKitaplarSayfasi(EmanettekiKitaplarSayfasi emanettekiKitaplarSayfasi) {
        this.emanettekiKitaplarSayfasi = emanettekiKitaplarSayfasi;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    

    
    
    
    
    
    
}
