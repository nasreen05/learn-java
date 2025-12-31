package oops.classConcept;

public abstract class Vehicle {
    String color="red";
    String name;

    public static void main(String[] args) {
        int price = 10000;
        Vehicle vehicle = new Vehicle() {
            @Override
            public void changeGear(int a) {

            }

            @Override
            public void speedUp(int a) {

            }

            @Override
            public void applyBreak(int a) {

            }
        };
        System.out.println(vehicle.color);
        System.out.println(price);
        Vehicle vehicle1 = new Vehicle() {
            @Override
            public void changeGear(int a) {

            }

            @Override
            public void speedUp(int a) {

            }

            @Override
            public void applyBreak(int a) {

            }
        };
        System.out.println(vehicle1.color);
        vehicle.color = "green";
        System.out.println("After modifying first");
        System.out.println(vehicle.color);
        System.out.println(vehicle.color);
        System.out.println("Calling non static method using object reference");
        System.out.println(vehicle.displayColor());
        System.out.println("First object name");
        System.out.println(vehicle.name);
        System.out.println("Modifying first Object reference ");
        vehicle.name = "Activa";
        System.out.println("printing first object name");
        System.out.println(vehicle.name);
        System.out.println("printing second object name");
        System.out.println(vehicle1.name);


        System.out.println("Accesing static method");
        System.out.println(Vehicle.vehicleDetails());
        System.out.println(vehicle.vehicleDetails());

        //using object  Reference we can call non static variable , non static method
        //using object reference we can call static method , static variable


        //static method ,  static variable can be called  using classname or with object reference
        //non static method , non static variable can be called using only object refrence

    }
    public String displayColor() {
        return color;
    }
    public static String vehicleDetails() {
           return  "Vehicle Details";


     }


    public abstract void changeGear(int a);

    public abstract void speedUp(int a);

    public abstract void applyBreak(int a);
}
