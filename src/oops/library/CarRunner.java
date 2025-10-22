package library;

public class CarRunner {
    public static void main(String[] args) {
        Car c1 = new Car("Swift", "Maruti", 2022);
        Car c2 = new Car("Swift", "Maruti", 2022);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("== : " + (c1 == c2));
        System.out.println("equals : " + c1.equals(c2));
    }
}
