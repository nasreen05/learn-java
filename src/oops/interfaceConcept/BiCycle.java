package oops.interfaceConcept;

public class BiCycle implements  Vehicle {

    int speed, gear;

    public BiCycle(){}

   public BiCycle(int speed , int gear){
        this.speed=speed;
        this.gear=gear;
   }
    @Override
    public void changeGear(int a){
        gear=a;
        }

    @Override
    public void speedUp(int a){
        speed=speed+a;
    }

    @Override
    public void applyBreak(int a){
        speed=speed-a;
    }
   public String printStates(){
        return "States of Bicycle is speed"+speed+"Gear"+gear;

   }
}
