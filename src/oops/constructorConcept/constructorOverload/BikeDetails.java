package oops.constructorConcept.constructorOverload;

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