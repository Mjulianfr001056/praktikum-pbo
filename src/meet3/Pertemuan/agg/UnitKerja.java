/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.Pertemuan.agg;

import java.util.List;

/**
 *
 * @author user
 */
public class UnitKerja {
    private String nama;
    private List<Pegawai> daftarPegawai;
    
    public UnitKerja(String nama, List<Pegawai> pegawais){
        this.nama = nama;
        this.daftarPegawai = pegawais;
    }
    
    public String getNama(){
        return nama;
    }
    
    public List<Pegawai> getDaftarPegawai(){
        return daftarPegawai;
    }
}
