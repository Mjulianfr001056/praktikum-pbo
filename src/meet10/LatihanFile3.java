package meet10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LatihanFile3 {
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream fis = null;
        File f = new File("D:\\user\\Documents\\GitHub\\Praktikum-PBO\\src\\meet10\\textfile.txt");
        try {
            fis = new FileInputStream(f);
            while(fis.available()>0){
                System.out.print((char) fis.read());
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        }finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
    }
}

