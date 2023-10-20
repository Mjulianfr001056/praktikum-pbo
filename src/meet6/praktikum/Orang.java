package meet6.praktikum;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Orang {

    String nama;
    Calendar tanggalLahir;

    public Orang() {

    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public Orang(String nama, Calendar tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
            validatetanggallahir();
            return sdf.format(tanggalLahir.getTime());
        } catch (Exception e){
            return "Belum Tersedia.";
        } finally{
            System.out.println("error tertangani.");
        }
    }

    public void setTanggalLahir(Calendar tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNamaPanggilan(){
        return nama.substring(0, 3);
    }

    void validatetanggallahir() throws Exception {
        if(tanggalLahir.get(Calendar.YEAR)<2000){
            throw new Exception("Dibawah umur");
        }else {
            System.out.println("cukup umur");
        }
    }

    abstract public String getAlamat();
    abstract public void setAlamat(String alamat);

    @Override
    public String toString() {
        return "Orang{" +
                "\nnama='" + nama + '\'' +
                "\ntanggalLahir=" + tanggalLahir.toString().substring(4, 11).replace(' ', '-') +
                tanggalLahir.toString().substring(24, 28).replace(' ', '-') +
                '}';
    }
}
