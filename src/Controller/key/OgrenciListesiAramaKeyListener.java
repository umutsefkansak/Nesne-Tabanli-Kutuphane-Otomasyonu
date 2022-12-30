
package Controller.key;

import GUI.OgrenciListesiSayfasi;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class OgrenciListesiAramaKeyListener implements KeyListener{
    
    private OgrenciListesiSayfasi ogrenciListesiSayfasi;
    
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == getOgrenciListesiSayfasi().getArama_cubugu()){
            String ara = getOgrenciListesiSayfasi().getArama_cubugu().getText();
            DinamikAra(ara);
        }
    }
    
    public void DinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(getOgrenciListesiSayfasi().getModel());
        getOgrenciListesiSayfasi().getOgrenci_tablosu().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    
    public OgrenciListesiAramaKeyListener(OgrenciListesiSayfasi ogrenciListesiSayfasi) {
        this.ogrenciListesiSayfasi = ogrenciListesiSayfasi;
    }

    public OgrenciListesiSayfasi getOgrenciListesiSayfasi() {
        if(this.ogrenciListesiSayfasi == null){
            ogrenciListesiSayfasi = new OgrenciListesiSayfasi();
        }
        return ogrenciListesiSayfasi;
    }

    public void setOgrenciListesiSayfasi(OgrenciListesiSayfasi ogrenciListesiSayfasi) {
        this.ogrenciListesiSayfasi = ogrenciListesiSayfasi;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    
    
    
    
    
}
