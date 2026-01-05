package oops.interfaceConcept.library;

public class PhoneRunner {
        public static void main(String[] args) {
            Phone p1 = new Phone("Samsung", "S22", 80000);
            Phone p2 = new Phone("Samsung", "S22", 80000);

            System.out.println(p1);
            System.out.println(p2);
            System.out.println("== : " + (p1 == p2));
            System.out.println("equals : " + p1.equals(p2));
        }
    }


