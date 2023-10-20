package meet4.tugas.mov1;

public class TestMov1 {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0, 0, 1, 2);
        System.out.println("Movable Point: ");
        System.out.println(p1);

        System.out.print("Move up: ");
        p1.moveUp();
        System.out.println(p1);

        System.out.print("Move down: ");
        p1.moveDown();
        System.out.println(p1);

        System.out.print("Move left: ");
        p1.moveLeft();
        System.out.println(p1);

        System.out.print("Move right: ");
        p1.moveRight();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(0, 0, 1, 2, 7);
        System.out.println("\nMovable Circle: ");
        System.out.println(c1);

        System.out.print("Move up: ");
        c1.moveUp();
        System.out.println(c1);

        System.out.print("Move down: ");
        c1.moveDown();
        System.out.println(c1);

        System.out.print("Move left: ");
        c1.moveLeft();
        System.out.println(c1);

        System.out.print("Move right: ");
        c1.moveRight();
        System.out.println(c1);
    }
}
