package oops.typeCasting.upCasting;

public class TestLaptop {
    public static void main(String[] args) {
        Hp h=new Hp("Hp",8587,"i7");
        Laptop l=h;
        System.out.println(h.brand);
        System.out.println(h.price);

    }
}
