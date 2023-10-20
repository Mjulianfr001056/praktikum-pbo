package meet2.Tugas.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account akun1 = new Account("1", "Juan", 1000);
        Account akun2 = new Account("2", "Farhan", 500);
        System.out.println("Saldo awal "+akun1.getName()+" : "+akun1.getBalance());
        System.out.println("Saldo akhir "+akun1.getName()+" : "+akun1.transferTo(akun2, 500));
        System.out.println("Keterangan: ");
        System.out.println(akun1);
        System.out.println(akun2);
    }
}
