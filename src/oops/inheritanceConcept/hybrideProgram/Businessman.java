package oops.inheritanceConcept.hybrideProgram;

public class Businessman   extends Person {
    double capital;

    void getBusiness(double c) {
        capital = c;
    }

    void showBusiness() {
        System.out.println("Capital: " + capital);
    }
}
