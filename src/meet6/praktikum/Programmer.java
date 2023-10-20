package meet6.praktikum;

import java.util.Calendar;

public class Programmer extends Pegawai {
    String bahasaPemograman;
    String platform;

    public Programmer(String nama, Calendar tanggalLahir) {
        super(nama, tanggalLahir);
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
