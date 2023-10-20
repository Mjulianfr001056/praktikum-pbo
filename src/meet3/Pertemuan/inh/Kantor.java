/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.Pertemuan.inh;

import java.util.Date;

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
        
        System.out.println("Ada orang:");
        System.out.println(lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir());
        System.out.println(rahma.getNama() + " lahir pada " + rahma.getTanggalLahir());
        
        Pegawai tuti = new Pegawai("Tuti", new Date(1997 - 1900,8,2), "6836492379", "STIS", "IT");
        System.out.println(tuti.getName() + 
                " lahir pada " + tuti.getTanggalLahir() +
                " NIP: " + tuti.getNIP() +
                " kantor: " + tuti.getNamaKantor() +
                " bagian: " + tuti.getUnitKerja());
    }
}
