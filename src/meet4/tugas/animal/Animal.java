package meet4.tugas.animal;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void greets();
}
