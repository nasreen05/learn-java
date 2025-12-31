package oops.interfacePrograms;

public class VehicleRunner {
  public static void main(String[] args) {

    // Vehicle vehicle= new Vehicle();
    BiCycle biCycle = new BiCycle();
    System.out.println(biCycle.speed);
    System.out.println(biCycle.gear);

    // instance / non static variable - we will have default values
    // local variable doesn't have default value
    // local variable has to be initialize before using it

    biCycle.speedUp(10);
    biCycle.changeGear(10);
    biCycle.speedUp(10);
    biCycle.applyBreak(10);

    System.out.println(biCycle.printStates());
   //  biCycle.display1();

    MotoCycle motocycle = new MotoCycle();
    Vehicle vehicle = new Vehicle(0, 1) {
        @Override
        public void changeGear(int a) {

        }

        @Override
        public void speedUp(int a) {

        }

        @Override
        public void applyBreak(int a) {

        }
    };
    vehicle.speedUp(20);
    vehicle.changeGear(2);
    //system.out.println(vehicle.printStates());
      if(vehicle instanceof  MotoCycle){
          MotoCycle motoCycle1=(MotoCycle) vehicle;
          System.out.println(motoCycle1.printStates());

      }
  }
   }
