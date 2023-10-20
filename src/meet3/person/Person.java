/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.person;

/**
 *
 * @author user
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdress(){
        return address;
    }
    
    public void setAdress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return "Person[name=" + name + ",address=" + address + ']';
    }
}
