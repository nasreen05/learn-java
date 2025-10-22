package Interface_OPPs;

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
    Vehicle vehicle = new MotoCycle(0, 1);
    vehicle.speedUp(20);
    vehicle.changeGear(2);
    //system.out.println(vehicle.printStates());
      if(vehicle instanceof  MotoCycle){
          MotoCycle motoCycle1=(MotoCycle) vehicle;
          System.out.println(motoCycle1.printStates());

      }
  }
   }
