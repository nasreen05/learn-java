package Polymorphism;

class Bank1 {
    public int deposit = 150;
    public int withdrow = 50;

    Bank1() {
    }

    Bank1(int deposit, int withdrow) {
        this.deposit = deposit;
        this.withdrow = withdrow;
    }

    public float getRateOfInterset() {
        return 5.0f;
    }
}

class SbiBank extends Bank1 {
    SbiBank() {
    }

    SbiBank(int deposit, int withdrow) {
        super(deposit, withdrow);
    }

    public float getRateOfInterset() {
        return 7.0f;
    }
}

class IciciBank extends Bank1 {
    IciciBank() {
    }

    IciciBank(int deposit, int withdrow) {
        super(deposit, withdrow);
    }

    public float getRateOfInterset() {
        return 7.5f;
    }
}

class AxisBank extends Bank1 {   // ✅ corrected (Bank1 instead of Bank)
    AxisBank() {
    }

    AxisBank(int deposit, int withdrow) {
        super(deposit, withdrow);
    }

    public float getRateOfInterset() {
        return 8.0f;
    }
}

public class AllBankRunner {
    public static void main(String[] args) {
        Bank1 sbi = new SbiBank(200, 50);
        System.out.println("Rate for SBI is " + sbi.getRateOfInterset());
        System.out.println("Deposit of SbiBank is " + sbi.deposit);
        System.out.println("Withdrow of SbiBank is " + sbi.withdrow);

        Bank1 axis = new AxisBank(300, 100);
        System.out.println("Rate of Interest for Axis is " + axis.getRateOfInterset());
        System.out.println("Deposit of Axis bank is " + axis.deposit);
        System.out.println("Withdrow of Axis is " + axis.withdrow);

        Bank1 icici = new IciciBank(400, 200);
        System.out.println("Rate of Interest for Icici is " + icici.getRateOfInterset());
        System.out.println("Deposit of Icici bank is " + icici.deposit);
        System.out.println("Withdrow of Icici is " + icici.withdrow);


    }
}

