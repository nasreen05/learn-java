package oops.methodConcept.overloading;
class Address{
    int house_no;
    String cityName;
    String state;
    int pin;

    void details(){
        System.out.println("house_no"+house_no);
        System.out.println("cityName"+cityName);
        System.out.println("state"+state);
        System.out.println("Pin"+pin);
    }
}
//Method returnType void  , primitive , classtype , arrayType
class Sohel {
    static void tellName() {
        System.out.println("sohel is telling ");
        System.out.println("her name is soniya");
    }

    static long phoneNumber() {
        System.out.println("Sohel shering her phone number");
        return 9000087765l;
    }

    static Address getAddress() {
        Address ads = new Address();
        ads.house_no = 101;
        ads.cityName = "kolkata";
        ads.state = "west bengal";
        ads.pin = 733207;
        return ads;
    }

    static long[] getPhoneNumber() {
        System.out.println("Shearing all phone numbers");
        return new long[]{1212121212l, 2323232323l, 4545454545l};

    }
}
public class SubhashRunner {
    public static void main(String[] args) {
        Sohel.tellName();
        long phone = Sohel.phoneNumber();
        System.out.println("Subhash has received the phoneNumber :"+phone);
        Address soniyaAdress=Sohel.getAddress();
        soniyaAdress.details();
        long[] phones= Sohel.getPhoneNumber();
        System.out.println("Now shearing all the phone Number");
        for(long numbers :phones){
            System.out.println("Darlings" +numbers);

        }

    }
}
