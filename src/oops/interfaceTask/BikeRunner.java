package InterfaceTask;

public class BikeRunner {
        public static void main(String[] args){
            Bike bike = new SuperBike();
            bike.mileage();

            Bike bike1 = new MountainBike();
            bike1.mileage();

        }
    }

