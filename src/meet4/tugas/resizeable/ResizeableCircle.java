package meet4.tugas.resizeable;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizeableCircle[" + super.toString() + ']';
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent/100.0;
    }
}
