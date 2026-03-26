package oops.typeCasting.downCasting;

import oops.typeCasting.upCasting.Hp;
import oops.typeCasting.upCasting.Laptop;

public class LaptopTest {
    public static void main(String[] args) {
        Hp h=new Hp("Hp",8587,"i7");
        Laptop l=h;
        Hp h2=(Hp)l;
        System.out.println(h2.processor );

    }
}

