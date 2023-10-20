package meet2.Tugas.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3,"blue",false);
        System.out.println(c1);

        Rectangle r1 = new Rectangle(20, 30);
        System.out.println("Keliling persegi panjang : "+r1.getPerimeter());
        System.out.println(r1);

        Square s1 = new Square();
        System.out.println(s1);
    }
}
