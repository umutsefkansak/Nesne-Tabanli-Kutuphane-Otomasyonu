
package DAO;

import Util.DosyaIslemleri;
import java.io.IOException;


public abstract class AbstractDAO<T> {
    
    public void ekle(String kaydedilecekYer,T entity) throws IOException{
        DosyaIslemleri islemler = new DosyaIslemleri();
        islemler.yazdir(kaydedilecekYer, entity.toString());
    }
}
