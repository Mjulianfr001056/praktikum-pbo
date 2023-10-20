/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.Pertemuan.agg;
import java.util.Date;

/**
 *
 * @author user
 */
public class Orang {
    private String nama;
    private Date tanggalLahir;
    
    public Orang(){
        
    }
    
    public Orang(String nama){
        this.nama = nama;
    }
    
    public Orang(String nama, Date tanggalLahir){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public Date getTanggalLahir(){
        return tanggalLahir;
    }
    
    public void setTanggalLahir(Date tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    
    public void getGaji(){
        System.out.println("Tidak ada");
    }
    
}
