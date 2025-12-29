package oops.methodConcept.overloading;
class Laptop{
    static void name(String company){
        String result=company;
        System.out.println(result);
    }
    static  void name(String company, String place){
        String  result =company;
        String  result1=place;
        System.out.println(result);
        System.out.println(result1);
    }
}
public class LaptopRunner {

    public static void main(String[] args) {
        Laptop.name("Dell");
        Laptop.name("hp","kolkata");
    }}
