/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.cylinder;

/**
 *
 * @author user
 */
public class Cylinder {
    private Circle base;
    private double height;
    
    public Cylinder(){
        base = new Circle();
        height = 1;
    }
    
    public Cylinder(double radius){
        base = new Circle(radius);
        height = 1;
    }
    
    public Cylinder(Circle base, double height){
        this.base = base;
        this.height = height;
    }
    
    public Cylinder(double radius, String color, boolean isFilled){
        base = new Circle(radius, color, isFilled);
        height = 1;
    }
    
    public Cylinder(double radius, String color, boolean isFilled, double height){
        base = new Circle(radius, color, isFilled);
        this.height = height;
    }
    
    public Circle getBase(){
        return base;
    }
    
    public void setBase(double radius, String color, boolean isFilled){
        base.setRadius(radius);
        base.setColor(color);
        base.setFilled(isFilled);
    }
    
    public double getArea(){
        return base.getPerimeter() * height + 2*base.getArea();
    }
    
    public double getVolume(){
        return base.getArea() * height;
    }
    
    @Override
    public String toString(){
        return "Cylinder[Base[radius=" + base.getRadius() +
                ",color=" + base.getColor() +
                ",filled=" + base.isFilled() +
                "],height=" + height + ']';
    }
}
