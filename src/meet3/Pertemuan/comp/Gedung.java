/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.Pertemuan.comp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Gedung {
    private List<Ruang> daftarRuang = new ArrayList<Ruang>();
    
    public Gedung(){
        Ruang ruang = new Ruang("Utama");
        daftarRuang.add(ruang);
    }
    
    public void addRuang(String namaRuang){
        Ruang ruang = new Ruang(namaRuang);
        daftarRuang.add(ruang);
    }
    
    public List<Ruang> getDaftarRuang(){
        return daftarRuang;
    }
}
