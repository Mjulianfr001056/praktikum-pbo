package meet4.tugas.mov2;


public class TestMov2 {
    public static void main(String[] args) {
        MovableRectangle m1 = new MovableRectangle(0, 0, 3, 4, 1, 2);
        System.out.println("Movable Rectangle: ");
        System.out.println(m1);

        System.out.println("Move up: ");
        m1.moveUp();
        System.out.println(m1);

        System.out.println("\nMove down: ");
        m1.moveDown();
        System.out.println(m1);

        System.out.println("\nMove left: ");
        m1.moveLeft();
        System.out.println(m1);

        System.out.println("\nMove right: ");
        m1.moveRight();
        System.out.println(m1);
    }
}
