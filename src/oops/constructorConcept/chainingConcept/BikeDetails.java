package oops.constructorConcept.chainingConcept;
class  Bike {
    int id;
    String brand;
    String model;
    double price;
    String color;

    public Bike(int id ) {
        this.id = id;
    }
    public Bike(int id ,String brand){
        this(id);
        this.brand = brand;
    }
    public  Bike( int id, String brand, String model) {
        this(id, brand);
        this.model=model;
    }
    public Bike(int id, String brand, String model, double price) {
        this(id, brand ,model);
        this.price = price;
    }

    public Bike(int id, String brand, String model, double price, String color) {
        this(id, brand,model,price);
        this.color=color;
    }
}
public class BikeDetails {
    public static void displayDetails(Bike e) {
        System.out.println(" Id is :" + e.id);
        System.out.println("insName is :" + e.brand);
        System.out.println(" place :" + e.model);
        System.out.println("price :" + e.price);
        System.out.println("color :" + e.color);
        System.out.println("=====================");
    }

    public  static void main(String[]args){
        Bike e1= new Bike(05,"Royal Enfield  GT 535 ", "R15",1800000.0,"Black");
        displayDetails(e1);
        Bike e2= new Bike(06,"Honda","Shine",170000.0,"Brown");
        displayDetails(e2);
        Bike e3= new Bike(07,"KTM","Duka",20000.0,"White");
        displayDetails(e3);
    }

}

