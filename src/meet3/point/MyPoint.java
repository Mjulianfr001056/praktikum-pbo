/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.point;

/**
 *
 * @author user
 */
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint(){
        x = 0;
        y = 0;
    }
    
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public int[] getXY(){
        int [] xy = {x,y};
        return xy;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return ("("+ x +"," + y + ")");
    }
    
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    
    public double distance(MyPoint another){
        int _x = another.getX();
        int _y = another.getY();
        
        return Math.sqrt(Math.pow(this.x - _x, 2) + Math.pow(this.y - _y, 2));
    }
    
    public double distance(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    
}
