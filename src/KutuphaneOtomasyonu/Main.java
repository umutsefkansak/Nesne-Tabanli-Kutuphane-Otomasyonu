
package KutuphaneOtomasyonu;

import GUI.GirisSayfasi;
import GUI.pencere.AnaPencere;

public class Main {
    public static void main(String[] args) {
        AnaPencere ap = new AnaPencere();
        ap.build(new GirisSayfasi());
    }
}
