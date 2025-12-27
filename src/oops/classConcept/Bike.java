package oops.classConcept;

public class Bike {
    String name="active";
    public static int price=10000;
    public static void main(String[] args){
        int milegae=30;
        System.out.println(milegae);
        //non-static variable cannot be accessed in static method
        //System.out.println(name);

        System.out.println(price);
//object/instance
        Bike bike = new Bike();
        //constructor- constructor name same as class name
        //to create object
        System.out.println(bike.name);
        Bike bike1=new Bike();
        System.out.println(bike1.name);
        bike.name="Dio";
        System.out.println(bike.name);
        System.out.println(bike.name);

    }
}
