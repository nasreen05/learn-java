package oops.interfacePrograms;

public class LaptopRunner {
        public static void main(String[] args){
            Laptop dell = new DellLaptop(60000, "Delhi");
            Laptop asus = new AsusLaptop(55000, "Bangalore");
            dell.showDetails();
            asus.showDetails();
        }
}


