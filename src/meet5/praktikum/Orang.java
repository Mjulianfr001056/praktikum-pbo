package meet5.praktikum;

import java.util.Date;

public abstract class Orang {

    String nama;
    Date tanggalLahir;

    public Orang() {

    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public Orang(String nama, Date tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNamaPanggilan(){
        return nama.substring(0, 3);
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
