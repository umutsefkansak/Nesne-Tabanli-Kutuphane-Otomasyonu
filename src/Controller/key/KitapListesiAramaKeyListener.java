
package Controller.key;

import GUI.KitapListesiSayfasi;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class KitapListesiAramaKeyListener implements KeyListener{
    
    private KitapListesiSayfasi kitapListesiSayfasi;
    
    @Override
    public void keyReleased(KeyEvent e) {
      if(e.getSource() == getKitapListesiSayfasi().getArama_cubugu()){
          String ara = getKitapListesiSayfasi().getArama_cubugu().getText();
          DinamikAra(ara);
      }
    }
    
    public void DinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(getKitapListesiSayfasi().getModel());
        getKitapListesiSayfasi().getKitap_tablosu().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    
    public KitapListesiAramaKeyListener(KitapListesiSayfasi kitapListesiSayfasi) {
        this.kitapListesiSayfasi = kitapListesiSayfasi;
    }
    
    public KitapListesiSayfasi getKitapListesiSayfasi() {
        return kitapListesiSayfasi;
    }

    public void setKitapListesiSayfasi(KitapListesiSayfasi kitapListesiSayfasi) {
        this.kitapListesiSayfasi = kitapListesiSayfasi;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    

    
    
    
    
}
