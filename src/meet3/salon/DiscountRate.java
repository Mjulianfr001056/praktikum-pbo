/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.salon;

/**
 *
 * @author user
 */
public class DiscountRate {
    final static double serviceDiscountPremium = 0.2d;
    final static double serviceDiscountGold = 0.15d;
    final static double serviceDiscountSilver = 0.1d;
    final static double productDiscountPremium = 0.1d;
    final static double productDiscountGold = 0.1d;
    final static double productDiscountSilver = 0.1d;
    
    public static double getServiceDiscountRate(String type) {
        return switch (type) {
            case "Premium" -> serviceDiscountPremium;
            case "Gold" -> serviceDiscountGold;
            case "Silver" -> serviceDiscountSilver;
            default -> 0.0;
        };
    }
    
    public static double getProductDiscountRate(String type) {
        return switch (type) {
            case "Premium" -> productDiscountPremium;
            case "Gold" -> productDiscountGold;
            case "Silver" -> productDiscountSilver;
            default -> 0.1;
        };
    }
    
}
