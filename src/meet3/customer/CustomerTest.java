/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.customer;

/**
 *
 * @author user
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Julian Firdaus", 17);
        Invoice i1 =  new Invoice(1, c1, 100000);
        
        System.out.println(i1.toString());
        System.out.println(i1.getAmountAfterDiscount());
    }
}
