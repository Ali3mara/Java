/*
 * File: Father.java
 * Description: Superclass in the inheritance example. Defines a method to be inherited or overridden.
 * Author: AliEmara
 * Date: 30/4/2025
 * Learning Goal: Understand how superclass methods are defined and reused in subclasses.
 */

package OOP.Inheritance;


// This class represents the parent class in the inheritance chain
public class Father {
    public void fatherDis() {

        // Method to be inherited and overridden
        System.out.println("FATHER");

    }

    void fatherDisPrivate() {
        // This method is private and cannot be accessed by subclasses
        System.out.println("FATHER PRIVATE");
    }

    String firstName, lastName;
    int age;
    public Father(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    } //I can use super in the child class constructor to call the parent class constructor

}
