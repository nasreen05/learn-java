package oops.library;

import java.util.Objects;

public class Cracker {

    private String name;
    private int price;

    public Cracker() {}

    public Cracker(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Cracker cracker = new Cracker("Rocket", 1200);
        System.out.println(cracker);

        Cracker cracker1 = new Cracker("Rocket", 1200);
        System.out.println(cracker1);

        System.out.println(cracker.equals(cracker1));
        System.out.println(cracker.hashCode());
        System.out.println(cracker1.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cracker) {
            Cracker cracker = (Cracker) obj;
            if (this.name.equals(cracker.name)) {
                if (this.price == cracker.price) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Cracker Details name = " + name + " price = " + price;
    }
}

// finalize method is used called by garbage collection
//Garbage collector removed the object which are
//eligible for garbage collection i.e. objects are null
// Difference between final , finally , finalize
//clone