/*
 * File: Main.java
 * Description: Main class to demonstrate Java inheritance in action.
 * Author: AliEmara
 * Date: 30/4/2025
 * Learning Goal: Practice creating objects and invoking superclass/subclass methods to understand inheritance behavior.
 */

package OOP.Inheritance;

 /*
 * Section 1: Basic Inheritance
 * ----------------------------------
 * A Son object can call methods from Father because it inherits them.
 * Method overriding occurs when the child class provides a new version of a method.
 */

public class Main {
    public static void main(String[] args) {
        // Creating Son object to access both Son and Father methods
        Son son = new Son("Omar", "Emara", 10, "Cars");

        // Calls the overridden method from Son class
        son.fatherDis(); //PRINTS: SON OVERRIDE FATHER (because of overriding) AND FATHER (because of super call)

        // Calls a method unique to Son
        son.sonDis(); //PRINTS: SON

        // Creating a Father object to show that it can't access Son's methods
        Father father = new Father("Ali", "Emara", 30);
        father.fatherDis(); // PRINTS: FATHER (calls the method from Father class)
        father.fatherDisPrivate(); // PRINTS: FATHER PRIVATE (calls the private method from Father class)
        // father.sonDis(); // This would be invalid because father reference knows nothing about Son
        

        /*
         * Key Concept:
         * A parent reference cannot access child-specific methods,
         * but a child object can access inherited parent methods.
         */

         //Lets have a father name and a son name
         System.out.println("Father and Son Names:");
         System.out.println("Father Name: " + father.firstName + " " + father.lastName + ", Age: " + father.age);
         System.out.println("Son Name: " + son.firstName + " " + son.lastName + ", Age: " + son.age + ", Favorite Toy: " + son.favoriteToy);

         //Son after 5 years
            son.age += 5; // Incrementing son's age by 5 years
            son.favoriteToy = "Guns"; // Changing favorite toy to Guns
            System.out.println("Son after 5 years: " + son.firstName + " " + son.lastName + ", Age: " + son.age + ", Favorite Toy: " + son.favoriteToy);
}
}

/*
 * 🔁 Summary of What I Learned from This Inheritance Example:
 * ------------------------------------------------------------
 * ✅ How to define a superclass and subclass using `extends`.
 * ✅ How a subclass inherits fields and methods from a superclass.
 * ✅ How to override methods using `@Override` and customize behavior in the child class.
 * ✅ How to use `super` to call a method or constructor from the superclass.
 * ✅ Why private methods in the superclass are NOT inherited.
 * ✅ How to call both child and parent methods from a subclass object.
 * ✅ That a parent reference (Father father = new Father()) cannot access child methods.
 * ✅ How to use constructors in both parent and child classes with inheritance.
 * ✅ Practical understanding of access modifiers (private, public, default).
 * ✅ How inheritance helps structure real-world data (e.g., names, age, favoriteToy).
 *
 * 🎯 Next Topics to Learn:
 * - Polymorphism (`Father f = new Son();`)
 * - Abstract classes
 * - Interfaces
 * - Composition vs Inheritance (when to use which)
 */
