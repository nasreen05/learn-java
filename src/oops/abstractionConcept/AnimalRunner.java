package oops.abstractionConcept;
// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();

    // Concrete method
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class provides implementation
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Runner class
public class AnimalRunner {
    public static void main(String[] args) {
        // Create object of child class
        Animal myDog = new Dog();

        // Call methods
        myDog.sound();   // Calls abstract method implementation
        myDog.sleep();   // Calls concrete method from abstract class
    }
}


