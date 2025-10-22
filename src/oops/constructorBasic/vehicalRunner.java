package DemoConstructor;

class Vehical1 {
    String brand;

    Vehical1(String brand) {
        this.brand = brand;
        System.out.println("Vehical1 brand name: " + brand);
    }

    // Inner class Car5
    class Car5 extends Vehical1 {
        String model;

        Car5(String brand, String model) {
            super(brand);
            this.model = model;
            System.out.println("Car Vehical name: " + model);
        }

        Car5(String model) {
            this("unknown", model);
            System.out.println("Change the constructor with default constructor");
        }

        public void display() {
            System.out.println("Brand: " + brand + ", Model: " + model);
        }
    }
}

public class vehicalRunner {
    public static void main(String[] args) {
        // To access inner class, use outerclass.new innerclass()
        Vehical1 v = new Vehical1("TEMP"); // temporary outer class object
        Vehical1.Car5 car = v.new Car5("TOYOTO", "INNOVA");
        car.display();

        System.out.println("------");

        Vehical1.Car5 car1 = v.new Car5("Swift");
        car1.display();
    }
}
