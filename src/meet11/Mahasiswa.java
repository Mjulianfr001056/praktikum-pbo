/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet11;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Mahasiswa implements Serializable {
    private String nim, nama, jenisKelamin;
    private int umur;
    private String alamat, provinsi;
    private ArrayList<String> hobi = new ArrayList<>();

    public Mahasiswa() {
    }
    
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public ArrayList<String> getHobi() {
        return hobi;
    }

    public void setHobi(ArrayList<String> hobi) {
        this.hobi = hobi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mahasiswa{");
        sb.append("nim=").append(nim);
        sb.append(", nama=").append(nama);
        sb.append(", jenisKelamin=").append(jenisKelamin);
        sb.append(", umur=").append(umur);
        sb.append(", alamat=").append(alamat);
        sb.append(", provinsi=").append(provinsi);
        sb.append(", hobi=").append(hobi);
        sb.append('}');
        return sb.toString();
    }
    
}
