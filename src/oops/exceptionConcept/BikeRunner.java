package oops.exceptionConcept;

public class BikeRunner {
  public static void main(String[] args) {
    Vehicle vehicle = new Bike();
    try {
        vehicle.display();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }
        }
        // method override exceptions
//Exception
//Type of Exceptions
//Exception propagation - exception is sent to caller throws
//user defined exception


