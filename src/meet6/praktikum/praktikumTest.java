package meet6.praktikum;

import java.util.GregorianCalendar;

public class praktikumTest {
    public static void main(String[] args) {
        Pegawai rahma = new Pegawai("rahma", new GregorianCalendar());
        rahma.setTanggalLahir(new GregorianCalendar(2015,8,31));

        Pegawai lutfi = new Pegawai("lutfi");
        //lutfi.setTanggalLahir(new GregorianCalendar(2003,6,29));


        System.out.println("Ada orang:");

        System.out.println(lutfi.getNama()+ " lahir pada " + lutfi.getTanggalLahir());
        System.out.println(rahma.getNama()+ " lahir pada " + rahma.getTanggalLahir());


    }
}
