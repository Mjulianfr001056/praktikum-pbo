package meet5.praktikum;

import java.util.Date;

public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String kantor;
    private String unitKerja;
    private String alamat;
    private String NIDN;
    private String kelompokKeahlian;

    public Pegawai(String nama, Date tanggalLahir, String NIP, String kantor, String unitKerja, String alamat, String NIDN, String kelompokKeahlian) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.kantor = kantor;
        this.unitKerja = unitKerja;
        this.alamat = alamat;
        this.NIDN = NIDN;
        this.kelompokKeahlian = kelompokKeahlian;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getKantor() {
        return kantor;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    public String getUnitKerja(){
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja){
        this.unitKerja = unitKerja;
    }

    @Override
    public String getAlamat() {
        return this.alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String getNIDN() {
        return NIDN;
    }

    @Override
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    @Override
    public String getKeahlian() {
        return kelompokKeahlian;
    }

    @Override
    public String getPekerjaan() {
        return "mengajar";
    }

    @Override
    public void setKeahlian(String keahlian) {
        kelompokKeahlian = keahlian;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                super.toString() +
                "\nNIP='" + NIP + '\'' +
                "\nkantor='" + kantor + '\'' +
                "\nunitKerja='" + unitKerja + '\'' +
                "\nalamat='" + alamat + '\'' +
                "\nNIDN='" + NIDN + '\'' +
                "\nkelompokKeahlian='" + kelompokKeahlian + '\'' +
                "\npanggilan='" + super.getNamaPanggilan() +
                "} ";
    }
}
