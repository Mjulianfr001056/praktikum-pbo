/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.salon;
import java.util.Date;
/**
 *
 * @author user
 */
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, Date date){
        customer = new Customer(name);
        this.date = date;
    }
    
    public String getName(){
        return customer.getName();
    }
    
    public double getServiceExpense(){
        return serviceExpense;
    }
    
    public void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    
    public double getProductExpense(){
        return productExpense;
    }
    
    public void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    
    public double getTotalExpense(){
        double customerServiceDiscount = 
                DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double customerProductDiscount = 
                DiscountRate.getProductDiscountRate(customer.getMemberType());
        
        return serviceExpense * (1 - customerServiceDiscount) + 
                productExpense * (1 - customerProductDiscount);
    }
    
    @Override
    public String toString(){
        return "Visit[" + customer.toString() +
                ",date=" + date.toString() +
                ",serviceExpense=" + serviceExpense +
                ",productExpense=" + productExpense + ']';
    }
}
