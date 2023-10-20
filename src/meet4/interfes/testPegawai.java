package meet4.interfes;

public class testPegawai {
    public static void main(String[] args) {
        Pegawai lutfi = new Pegawai();

        lutfi.setAlamat("Otista 64 C");
        System.out.println(lutfi.getAlamat());

        lutfi.setNIDN("12345678");
        lutfi.setKelompokKeahlian("Computer Science");

        System.out.println("ada dosen Lutfi dengan NIDN " +
                lutfi.getNIDN() +
                " kelompok " + lutfi.getKelompokKeahlian());
    }
}
