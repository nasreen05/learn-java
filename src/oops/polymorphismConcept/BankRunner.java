package Polymorphism;

class Bank {
    public String timing = "10 to 4";

    Bank() {
    }

    Bank(String timing) {
        this.timing = timing;
    }

    public float getRateOfInterset() {
        return 5.0f;
    }
}

class Sbi extends Bank {
    Sbi() {
    }

    Sbi(String timing) {
        super(timing);
    }

    public float getRateOfInterset() {
        return 7.0f;
    }
}

class Axis extends Bank {
    Axis() {
    }

    Axis(String timing) {
        //this() or super();
        super(timing);
    }

    public float getRateOfInterset() {
        return 6.0f;
    }
}

public class BankRunner {
    public static void main(String[] args) {
        // upcasting - conversion of child to parent class
        Bank sbi = new Sbi("9:40 to 4");
        System.out.println("Rate for SBI is " + sbi.getRateOfInterset());
        System.out.println("Timing of SBI is " + sbi.timing);

        Bank axis = new Axis("10:30 to 5");
        System.out.println("Rate of Interset for Axis is " + axis.getRateOfInterset());
        System.out.println("Timing of Axis bank is " + axis.timing);
    }
}
