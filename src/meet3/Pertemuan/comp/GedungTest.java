/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.Pertemuan.comp;

import java.util.List;

/**
 *
 * @author user
 */
public class GedungTest {
    public static void main(String[] args) {
        Gedung STIS = new Gedung();
        STIS.addRuang("Lobi");
        STIS.addRuang("Bagian Umum");
        STIS.addRuang("Kepala Kantor");
        
        List<Ruang> ruangan = STIS.getDaftarRuang();
        for(Ruang ruang : ruangan){
            System.out.println("Ruang : " + ruang.getNamaRuang());
        }
        
    }
}
