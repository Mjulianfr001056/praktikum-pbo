package meet4.abstrak;

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

    abstract public String getAlamat();
    abstract public void setAlamat(String alamat);
}
