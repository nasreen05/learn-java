package Mobile;

public class Ios extends  Mobile{

    private String iosVersion;

    public Ios(String brand, double price, String iosVersion) {
        super(brand, price);
        this.iosVersion = iosVersion;
    }
    public Ios(){

}

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }
}

