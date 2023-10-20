package meet5.praktikum;

import java.util.Date;

public class praktikumTest {
    public static void main(String[] args) {
        Pegawai lutfi = new Pegawai(
                "lutfi",
                new Date(2000 - 1900, 8 - 1, 31),
                "222xxxxxx",
                "Otista 64C",
                "BAU",
                "Jl. Sensus 2",
                "xxx-xxx",
                "Statistika");

        Programmer rahma = new Programmer(
                "rahma",
                new Date(1999-1900, 10 - 1, 30),
                "222xxxxxx",
                "Otista 64C",
                "BAAK",
                "Jl. Mesjid",
                "xxx-xxx",
                "Programming",
                "Java",
                "Intellij IDEA");

        System.out.println("=========Pegawai=========");
        System.out.println(lutfi);
        System.out.println();

        System.out.println("=======Programmer========");
        System.out.println(rahma);


    }
}
