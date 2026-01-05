package Polymorphism;


class Bank0 {
    public int id;
    public String timing = "10 to 4";

    public float getRateOfInterset() {
        return 5.0f;
    }
}

class Sbi0 extends Bank0 {
    public String name;

    public Sbi0() {
    }

    public Sbi0(String timing) {
        this.timing = timing;
    }

    public float getRateOfInterset() {
        return 7.0f;
    }
}

class Axis0 extends Bank0 {
    public float getRateOfInterset() {
        return 6.0f;
    }
}

public class RunnerBank {
    public static void main(String[] args) {
        // upcasting - conversion of child to parent class
        Bank0 sbi = new Sbi0("9:40 to 4");
        Bank0 bank = new Bank0();

        System.out.println("Rate for SBI is " + sbi.getRateOfInterset());
        System.out.println("Timing of SBI is " + sbi.timing);

        Bank0 axis = new Axis0();
        System.out.println("Rate of Interset for Axis is " + axis.getRateOfInterset());
        System.out.println("Timing of Axis bank is " + axis.timing);

        System.out.println(bank.id);

        System.out.println(bank instanceof Sbi0);
        if (bank instanceof Sbi0) {
            Sbi0 sbi2 = (Sbi0) bank;
            System.out.println(sbi2.name);
        }
    }
}
