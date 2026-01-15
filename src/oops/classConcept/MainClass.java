package oops.classConcept;
class Building{ //skelton or architecture
    int floor=5;// state is nothing but information
    String place="Noida";
void leftFeature(){ //behaviour or function
    System.out.println("Available ");
}
void acFeature(){
    System.out.println("Not Available");
}
}

public class MainClass {
    public static void main(String[] args) {
     Building b= new Building();
        System.out.println("No of floor = " +b.floor);
        System.out.println("place =" + b.place);
     b.leftFeature();
     b.acFeature();


    }
}
