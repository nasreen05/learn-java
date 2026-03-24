package oops.inheritanceConcept.multiple_Inherit_InterfaceProgram.wifi;
public class Mobile implements Wifi, Camera {

    public void capture() {
        System.out.println("Photo captured successfully ");
    }

    public void internetConnection() {
        System.out.println("Internet connected successfully ");
    }

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.capture();
        m.internetConnection();
    }
}
