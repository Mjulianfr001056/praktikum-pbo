/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.salon;

/**
 *
 * @author user
 */
import java.util.Date;
public class SalonTest {
    public static void main(String[] args) {
        //Testing the Customer class
        Customer c1 = new Customer("Juan");
        c1.setMember(true);
        c1.setMemberType("Premium");
        System.out.println("Customer 1: "+ c1.toString());
        
        Customer c2 = new Customer("Farhan");
        c2.setMember(true);
        c2.setMemberType("Gold");
        if(c2.isMember()){
            System.out.println("Customer 2, " + c2.getName() + 
                    ", adalah member dengan tingkat " + c2.getMemberType());
        }else System.out.println("Customer 2, " + c2.getName() + ", bukan member!");
        
        Customer c3 = new Customer("Sabilla");
        System.out.println("Customer 3: " + c3.toString()+'\n');
        
        
        Date date;
        date = new Date(2023, 2, 20);
        Visit v1 = new Visit("Juan", date);
        
        v1.setProductExpense(175);
        v1.setServiceExpense(250);
        
        System.out.println(v1.getTotalExpense());
    }
}
