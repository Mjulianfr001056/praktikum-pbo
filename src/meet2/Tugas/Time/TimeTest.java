package meet2.Tugas.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(23, 59,59);
        System.out.println(t1.nextSecond().toString());

        Time t2 = new Time(00, 00,00);
        System.out.println(t2.previousSecond().toString());
    }
}
