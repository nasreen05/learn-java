package oops.constructorConcept.constructorOverload;

public class  Bike {
    int id;
    String brand;
    String model;
    double price;
    String color;

    public Bike(int id ) {
        this.id = id;
    }
        public Bike(int id ,String brand){
        this.id=id;
        this.brand = brand;
        }
        public  Bike( int id, String brand, String model) {
            this.id = id;
            this.brand = brand;
            this.model=model;
        }
        public Bike(int id, String brand, String model, double price) {
            this.id = id;
            this.brand = brand;
            this.model=model;
            this.price = price;
        }

    public Bike(int id, String brand, String model, double price, String color) {
        this.id = id;
        this.brand = brand;
        this.model=model;
        this.price = price;
        this.color=color;
    }
}
