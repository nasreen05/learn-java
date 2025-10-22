package Abstraction;

abstract class Laptop {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


    public abstract void start();
}

// Concrete class
class Dell extends Laptop {
    public Dell(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    public void start() {
        System.out.println(getBrand() + " laptop is starting...");
    }
}


public class LaptopRunner {
    public static void main(String[] args) {
        Laptop myLaptop = new Dell("Dell");
        myLaptop.start();
    }
}
