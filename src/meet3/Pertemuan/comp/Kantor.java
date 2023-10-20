/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.Pertemuan.comp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */

public class Kantor {
   
    public static void main(String[] args) {
        Orang lutfi = new Orang();
        lutfi.setNama("Lutfi");
        
        Orang rahma = new Orang("Rahma");
        Date ttl_Rahma = new Date(1997-1900, 8-1, 31);
        
        rahma.setTanggalLahir(ttl_Rahma);
               
        Pegawai tuti = new Pegawai("Tuti", new Date(1997 - 1900,8,2), "6836492379", "STIS", "IT");
//        System.out.print("gaji Orang Rahma :");
//        rahma.getGaji();
//        
//        System.out.print("gaji Orang Tuti :");
//        tuti.getGaji();

        List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        daftarPegawai.add(tuti);
        
        UnitKerja Umum = new UnitKerja("Umum", daftarPegawai);
        
    }
}
