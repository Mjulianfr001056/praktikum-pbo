package meet4.tugas.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat c1 = new Cat("Milo");
        System.out.println("Cat: ");
        c1.greets();

        Dog d1 = new Dog("Pluto");
        Dog d2 = new Dog("Steve");

        System.out.println("\nDog 1: ");
        d1.greets();
        d1.greets(d2);

        System.out.println("\nDog 1: ");
        d2.greets();
        d2.greets(d1);

        BigDog bd1 = new BigDog("Remmy");
        BigDog bd2 = new BigDog("Jennifer");

        System.out.println("\nBig Dog 1: ");
        bd1.greets();
        bd1.greets(d1);
        bd1.greets(d2);
        bd1.greets(bd2);

        System.out.println("\nBig Dog 2: ");
        bd2.greets();
        bd2.greets(d1);
        bd2.greets(d2);
        bd2.greets(bd1);
    }
}
