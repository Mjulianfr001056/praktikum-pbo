package meet5.praktikum;

import java.util.Date;

public class Programmer extends Pegawai{
    String bahasaPemograman;
    String platform;

    public Programmer(String nama, Date tanggalLahir, String NIP, String kantor, String unitKerja, String alamat, String NIDN, String kelompokKeahlian, String bahasaPemograman, String platform) {
        super(nama, tanggalLahir, NIP, kantor, unitKerja, alamat, NIDN, kelompokKeahlian);
        this.bahasaPemograman = bahasaPemograman;
        this.platform = platform;
    }

    public String getBahasa() {
        return bahasaPemograman;
    }

    public void setBahasa(String bahasa) {
        this.bahasaPemograman = bahasa;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPekerjaan(){
        return "Coding all along day";
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() +
                "\nbahasaPemograman='" + bahasaPemograman + '\'' +
                "\nplatform='" + platform + '\'' +
                "} ";
    }
}
