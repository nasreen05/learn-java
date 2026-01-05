package oops.interfaceConcept;

public class SBI implements RBI{

    String name;
    String address;
    int balance;

    public  SBI(){

    }

    public SBI(String name,String address){
        this.name=name;
        this.address=address;
    }
    @Override
    public String OpenAccount(String name, String address) {
        return "";
    }

    @Override
    public double getRateOfInterset() {
        return 6.5d;
    }

    public String getName(){
        return name;
    }
}
