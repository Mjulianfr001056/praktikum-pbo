/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.customer;

/**
 *
 * @author user
 */
public class Customer {
    private int id;
    private String name;
    private int discount;
    
    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    @Override
    public String toString(){
        return name + '(' + id + ")(" + discount + "%)";
    }
}
