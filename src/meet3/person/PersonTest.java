/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.person;

/**
 *
 * @author user
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Julian Firdaus", "Otista 2");
        Student s1 = new Student("Farhan Maulana", "Polonia", "D4 KS", 2, 1000000);
        Staff st1 = new Staff("Adinda Ayu P", "Mesjid", "Polstat STIS", 1000000);
        
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(st1.toString());
    }
}
