package oops.methodConcept.overloading;

public class VehicleRunner {
     static  void goOffice(String car) {
         String result = car;
         System.out.println(result);
     }
     static void goOffice(String car ,String bus ) {
         String result = bus;
         System.out.println(result);
     }
     static  void goOffice(String car, String bus, String ownVehicle){
         String result=ownVehicle;
         System.out.println(result);
         }

    }
    class Vehicle{
        public static void main(String[] args) {
            VehicleRunner.goOffice("Car");
            VehicleRunner.goOffice("Car","Bus");
            VehicleRunner.goOffice("Car","bus","ownVehicle");
        }
}
