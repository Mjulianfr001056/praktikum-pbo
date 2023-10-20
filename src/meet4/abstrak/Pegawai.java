package meet4.abstrak;

import java.util.Date;

public class Pegawai extends Orang {
    private String NIP;
    private String namaKantor;
    private String unitKerja;
    private String alamat;

    public Pegawai() {
    }

    public Pegawai(String NIP, String namaKantor, String unitKerja){
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    public Pegawai(String nama, String NIP, String namaKantor, String unitKerja){
        super(nama);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    //New added Constructor
    public Pegawai(String nama, Date tanggalLahir, String NIP, String namaKantor, String unitKerja){
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNamaKantor(){
        return namaKantor;
    }

    public void setNamaKantor(String namaKantor){
        this.namaKantor = namaKantor;
    }

    public String getUnitKerja(){
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja){
        this.unitKerja = unitKerja;
    }

    String getName() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return this.alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
