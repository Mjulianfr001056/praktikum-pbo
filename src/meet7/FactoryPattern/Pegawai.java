package meet7.FactoryPattern;

public class Pegawai {
    private String nama;
    private String tipe;
    private String pembayarangaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getPembayarangaji() {
        return pembayarangaji;
    }

    public void setPembayarangaji(String pembayarangaji) {
        this.pembayarangaji = pembayarangaji;
    }

    @Override
    public String toString() {
        return  "nama             :" + this.nama +
                "\nTipe pegawai      :" + this.tipe +
                "\nPembayaran Gaji   :" + this.pembayarangaji;
    }
}
