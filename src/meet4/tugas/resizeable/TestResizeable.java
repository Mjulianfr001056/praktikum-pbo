package meet4.tugas.resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        System.out.print("Circle: " + c1 + '\n');

        ResizeableCircle rc1 = new ResizeableCircle(10);
        System.out.print("Resizeable Circle: " + rc1 + '\n');
        System.out.println("Resize by 75%");
        rc1.resize(75);
        System.out.print("Resizeable Circle: " + rc1 + '\n');
    }
}
