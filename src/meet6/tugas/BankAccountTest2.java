package meet6.tugas;

import java.util.Scanner; // untuk menampung input dari user
import java.util.ArrayList; // import the ArrayList class

/**
 * BankAccount Test aplikasi simulasi
 * @author nanoy
 * 
 */
public class BankAccountTest2 {
    static Scanner in = new Scanner(System.in);
    static void printPerson(ArrayList<Person> p){
        for (int i=0;i<p.size();i++) {
            System.out.format("%d. [nama: %s]\n",
                    i+1, p.get(i).getNama());
        }
    }

    static void setorTarik(ArrayList<Person> p, String str){
        Person person_i = p.get(0);
        try {
            // list objek person yang ada
            printPerson(p);

            System.out.format("Pilih [No.Urut] objek person yg ingin %s ? contoh: 1 / 2\n", str);
            person_i =  p.get(in.nextInt() - 1);
            in.nextLine();

            // tampilkan daftar rekening dari objek terpilih
            person_i.tampilListRekeningBank();

            System.out.format("Pilih Nomor Rekening objek person yg ingin di%s (9 digit)? contoh: 002393873\n", str);
            String noRek =  in.nextLine();

            System.out.format("Masukkan jumlah uang (Rp.) yang ingin di%s ? contoh: 10000\n", str);
            Double jumlahUang = in.nextDouble();
            in.nextLine();

            BankAccount ba = person_i.getAkunBank(noRek);

            if (str.equals("setor")) {
                ba.setor(jumlahUang);
            } else {
                ba.tarikSaldo(jumlahUang);
            }

            //tampilkan saldo akhir dari rek. yang disetor
            System.out.format("Saldo akhir objek %s no.rek %s Bank %s adalah %.2f\n",
                    person_i.getNama(),
                    noRek,
                    person_i.getAkunBank(noRek).getBank(),
                    person_i.getAkunBank(noRek).getSaldo()
            );
        }catch (Exception e) {
            System.out.println("Terjadi kesalahan Input atau No. Rekening Tidak Terdaftar!!");
        }
    }
    static void tampilMenu(ArrayList<Person> p) {
        Person person_i;
        boolean quit = false;
        do { 
            System.out.println("==== Pilih Menu ====");
            System.out.println("1.Buat Objek Person!");
            System.out.println("2.Buat Akun Bank pada Objek Person!");
            System.out.println("3.Lihat daftar rekening dari objek Person!");
            System.out.println("4.Setor Uang ke Rekening dari objek Person");
            System.out.println("5.Tarik Uang dari Rekening objek Person");
            System.out.println("6.Transfer Uang!");
            System.out.println("7.Tampilkan daftar Objek Person!");
            System.out.println("=======================");

            System.out.println("Pilih Menu no : ");
            String menu = in.nextLine();

            switch(menu) {
                // buat objek person baru
                case "1" -> {
                    try {
                        String nama;
                        int umur; 
                        do {
                            System.out.println("Nama objek Person : (tidak boleh blank) ");
                            nama = in.nextLine();
                            nama =  nama.replaceAll("\\s", "");
                        }while(nama.equals(""));
                        System.out.println("Umur : ");
                        umur = in.nextInt();
                        in.nextLine();
                        p.add(new Person(nama,umur));
                    }catch(Exception e) {
                        System.out.println("Terjadi kesalahan input!");
                    }
                 }
                // buka akun bank dari objek person yang ada
                case "2" -> {
                    try {
                        // list objek person yang ada
                        printPerson(p);

                        System.out.println("Pilih [No.Urut] objek person yang akan dibuat akun bank ? contoh: 1");

                        int i =  in.nextInt();
                        in.nextLine();

                        System.out.println("Ketik Nama Bank : (contoh: BRI / BCA / BSI / BNI /...)");
                        String namaBank = in.nextLine();

                        System.out.println("Ketik Kode Bank 3 digit angka: (contoh: 002 / 003 / 005 / 006 /...)");
                        String kdBank = in.nextLine();

                        System.out.println("Masukkan jumlah setoran awal Rp. : (tanpa pemisah ribuan,contoh: 100000)");
                        Double setorAwal = in.nextDouble();
                        in.nextLine();

                        p.get(i-1).bukaAkunBank(namaBank, kdBank, setorAwal);
                    }catch (Exception e) {
                        System.out.println("Terjadi kesalahan input atau belum ada objek Person yang dibuat!");
                    }
                    
                }
                // lihat daftar rekening dari objek person yang ada
                case "3" -> {
                    try {
                        // list objek person yang ada
                        printPerson(p);

                        System.out.println("Pilih [No.Urut] objek person yg ingin dilihat daftar rekeningnya ? contoh: 1");
                        int i =  in.nextInt();
                        in.nextLine();

                        //tampilkan list rekening bank dari objek person terpilih
                        p.get(i-1).tampilListRekeningBank();
                    }catch (Exception e) {
                        System.out.println("Terjadi kesalahan input atau belum ada objek Person yang dibuat!");
                    }  
                }
                // setor uang ke salah satu rekening dari objek person
                case "4" -> {
                    setorTarik(p, "setor");
                }
                // tarik uang dari salah satu rekening objek person
                case "5" -> {
                    setorTarik(p,"tarik");
                }
                case "6" -> {
                    try {
                        // list objek person yang ada
                        printPerson(p);

                        System.out.println("Pilih [No.Urut] objek person yg ingin melakukan transfer/kirim uang ? contoh: 1 / 2");
                        person_i = p.get(in.nextInt() - 1);
                        in.nextLine();

                        // tampilkan daftar rekening dari objek terpilih
                        person_i.tampilListRekeningBank();
                        System.out.println("Pilih Nomor Rekening Pengirim (9 digit)? contoh: 002393873");

                        String noRek =  in.nextLine();
                        System.out.println("Masukkan jumlah uang (Rp.) yang ingin dikirim (Pastikan saldo tersedia)? contoh: 10000");

                        Double jumlahUang = Double.parseDouble(in.nextLine());

                        // Dapatkan akun bank yang digunakan untuk mengirim/transfer
                        BankAccount ba = person_i.getAkunBank(noRek);

                        // Pilih penerima Transfer dari list objek person yang ada
                        printPerson(p);

                        System.out.println("Pilih [No.Urut] objek person  penerima transfer uang ? contoh: 1 / 2");
                        Person person_x = p.get(in.nextInt() - 1);
                        in.nextLine();

                        // tampilkan daftar rekening Penerima transfer (objek Person)
                        person_x.tampilListRekeningBank();

                        System.out.println("Pilih Nomor Rekening Penerima (9 digit)? contoh: 002393873");
                        String noRekPenerima =  in.nextLine();

                        // transfer
                        ba.transfer(jumlahUang, person_x, noRekPenerima);

                        // informasi saldo pengirim dan penerima
                        System.out.format(" (Pengirim) Saldo akhir objek %s no.rek %s Bank %s adalah %.2f\n",
                                        person_i.getNama(),
                                        noRek,
                                        person_i.getAkunBank(noRek).getBank(),
                                        person_i.getAkunBank(noRek).getSaldo()
                                     );
                        System.out.format(" (Penerima) Saldo akhir objek %s no.rek %s Bank %s adalah %.2f\n",
                                        person_x.getNama(),
                                        noRekPenerima,
                                        person_x.getAkunBank(noRekPenerima).getBank(),
                                        person_x.getAkunBank(noRekPenerima).getSaldo()
                                     );
                    }catch(Exception e) {
                         System.out.println("Terjadi kesalahan Input atau No. Rekening Tidak Terdaftar!!");
                    }
                }
                // tampilkan daftar objek Person yang ada
                case "7" -> {
                    for (int i=0;i<p.size();i++) {
                        System.out.format("%d. [nama: %s] [umur: %d] [total saldo semua bank : Rp. %.2f]\n",
                                        i+1,
                                        p.get(i).getNama(),
                                        p.get(i).getUmur(),
                                        p.get(i).rekapSaldoRekening()
                                    );
                    }
                }
                // program dihentikan/selesai
                default -> {
                    System.out.println("Inputan Tidak Terdaftar, Program dihentikan!");
                    quit = true;
                }
            }
        }
        while(!quit);        
    }
    /**
     * Entry Point
     * @param args 
     */
    public static void main(String[] args)  {
        ArrayList<Person> p = new ArrayList();
        tampilMenu(p);        
    }
    
}
