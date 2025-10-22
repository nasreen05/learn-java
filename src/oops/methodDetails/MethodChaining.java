package MethodDetails;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void guard() {
        System.out.println("Dog is guarding the house");
    }
}


public class MethodChaining {

    public static void main(String[] args) {
        // Upcasting
        Animal a = new Dog();
        a.sound(); // Runtime polymorphism → Dog's sound()

        // Downcasting
        Dog d = (Dog) a;   // Explicit downcasting
        d.sound();         // Dog's sound()
        d.guard();         // Access Dog-specific method
    }
}

