/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.cylinder;

/**
 *
 * @author user
 */
public class CylinderTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2,"Green", true);
        Cylinder cy1 = new Cylinder(c1, 2);
        
        System.out.println("Volume: " + cy1.getVolume());
        System.out.println("Area: " + cy1.getArea());
        System.out.println(cy1.toString());
    }
}
