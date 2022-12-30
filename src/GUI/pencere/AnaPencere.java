
package GUI.pencere;

import GUI.IDefaultSayfa;
import javax.swing.JFrame;


public class AnaPencere {
    private static JFrame frame;

    public AnaPencere() {
        getFrame();
    }
    
    public static void build(IDefaultSayfa gelenSayfa){
        frame.setContentPane(gelenSayfa.getPanel());
        
    }

    public static JFrame getFrame() {
        if(frame == null){
            frame = new JFrame("Kütüphane Otomasyonu");
            frame.setBounds(370, 120, 750, 600);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        GUI.pencere.AnaPencere.frame = frame;
    }
}
