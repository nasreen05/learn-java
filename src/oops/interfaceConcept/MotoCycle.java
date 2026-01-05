package oops.interfaceConcept;

import oops.classConcept.Vehicle;

public class MotoCycle extends Vehicle {

        int speed, gear;

        public MotoCycle(){}

        public MotoCycle(int speed , int gear){
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


