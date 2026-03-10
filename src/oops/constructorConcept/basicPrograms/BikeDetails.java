package oops.constructorConcept.basicPrograms;
class Bike {
    int id;
    String brand;
    String model;
    double price;
    String color;

    public void details() {
        System.out.println(brand + " " + model + " bike is ready to ride");
    }
}

public class BikeDetails {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.id = 1;
        b1.brand = " Royal Enfield  GT 535 ";
        b1.model = "R15";
        b1.price = 180000;
        b1.color = "Black";

        System.out.println("id is : " + b1.id);
        System.out.println("brand is : " + b1.brand);
        System.out.println("model is : " + b1.model);
        System.out.println("price is : " + b1.price);
        System.out.println("color is : " + b1.color);
        b1.details();
        System.out.println("----------------------------");


        Bike b2 = new Bike();
        b2.id = 2;
        b2.brand = "Honda";
        b2.model = "Shine";
        b2.price = 90000;
        b2.color = "Black";

        System.out.println("id is : " + b2.id);
        System.out.println("brand is : " + b2.brand);
        System.out.println("model is : " + b2.model);
        System.out.println("price is : " + b2.price);
        System.out.println("color is : " + b2.color);
        b2.details();
        System.out.println("----------------------------");


        Bike b3 = new Bike();
        b3.id = 3;
        b3.brand = "KTM";
        b3.model = "Duke 200";
        b3.price = 210000;
        b3.color = "Orange";

        System.out.println("id is : " + b3.id);
        System.out.println("brand is : " + b3.brand);
        System.out.println("model is : " + b3.model);
        System.out.println("price is : " + b3.price);
        System.out.println("color is : " + b3.color);
        b3.details();
        System.out.println("----------------------------");
    }
}

