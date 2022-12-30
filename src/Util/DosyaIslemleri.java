
package Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DosyaIslemleri {
    File f;
    
   public void yazdir(String kaydedilecekYer,Object veri) throws IOException{
       
       f = new File("data/"+kaydedilecekYer+".txt");
       if(!f.exists()){
           try {
               f.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       FileWriter fw = new FileWriter(f,true);
       fw.write(veri.toString()+"\n");
       fw.close();
   }
   
   public String oku(String okunacakDosya) throws FileNotFoundException, IOException{
       
       f = new File("data/"+okunacakDosya+".txt");
       
       if(!f.exists()){
           try {
               f.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
     /*  FileReader fr = new FileReader(f);
       BufferedReader br = new BufferedReader(fr);*/
       String line= "";
       
       Scanner scan = new Scanner(f);
       
       while(scan.hasNextLine()){
           line += scan.nextLine();
       }
       scan.close();
       return line;
   }
   
   public int getSonId(String dosyaAdi) throws FileNotFoundException, IOException{
       f = new File("data/"+dosyaAdi+".txt");
       
       if(!f.exists()){
           try {
               f.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       Scanner scan = new Scanner(f);
       int sayi=0;
       while(scan.hasNextInt()){
           sayi = scan.nextInt();
       }
       scan.close();
       return sayi;
    }
}