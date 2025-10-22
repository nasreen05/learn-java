package Interface_OPPs;
public class ICICI implements RBI{

    String  name;
    String address;

    public ICICI(){

    }

    public ICICI(String name,String address){
        this.name=name;
        this.address=address;
    }
    @Override
    public String OpenAccount(String name, String address) {

    ICICI icic = new ICICI(name, address);
        return icic.getName();
    }

    @Override
    public double getRateOfInterset() {
        return 7.0f;
    }

    public String getName(){
        return name;
    }
}