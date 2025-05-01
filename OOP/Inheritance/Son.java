/*
 * File: Son.java
 * Description: Subclass that extends Father and overrides one of its methods.
 * Author: AliEmara
 * Date: 30/4/2025
 * Learning Goal: Understand how subclasses inherit and override methods from their superclass.
 */

package OOP.Inheritance;

public class Son extends Father {
    // Son is a subclass of Father class
    //extends keyword is used to inherit properties and methods from the base class 
    public void sonDis() {
        System.out.println("SON");
    }

    // The @Override annotation indicates that this method overrides a method in the superclass (Just best practice)
    // It is not mandatory but helps in code readability and error checking
    @Override
    public void fatherDis() {
        // The Son class can override methods from the Father class
        System.out.println("SON OVERRIDE FATHER");

        // Calling the superclass method (Father's method) using super keyword
        super.fatherDis(); // Calls the method from the Father class
        /*  Notes about super:
         * Super can be added in any method in the child class to call the parent class method.
         * It is not mandatory to use super in the child class method.
         * If you don't use super, the child class method will not call the parent class method.
         * If you use super, the child class method will call the parent class method.
         */

        //super.fatherDisPrivate(); // This would be invalid because fatherDisPrivate is private in Father class
    }

    String favoriteToy;
    public Son(String firstName, String lastName, int age, String favoriteToy) {
        super(firstName, lastName, age); // super MUST be the first line in the constructor
        this.favoriteToy = favoriteToy;
    }
}

