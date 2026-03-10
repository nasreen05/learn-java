package oops.constructorConcept.basicPrograms;
class  Hospital {
    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfBeds;

    public void details() {
        System.out.println( hospitalName+ "  24hr Open ");
    }
}
public class HospitalDetails {
    public static void main(String[] args) {
        Hospital h1= new Hospital();
        h1.hospitalName="Kolkata Medical College";
        h1.location="Kolkata";
        h1.numberOfDoctors=2000;
        h1.numberOfBeds=100000;
        System.out.println("Hospital Name  is : "+ h1.hospitalName);
        System.out.println("Hospital location  is : "+h1.location);
        System.out.println("number of Doctors is : "+h1.numberOfDoctors);
        System.out.println("number of Doctors is : "+h1.numberOfBeds);

        h1.details();
        System.out.println("----------------------------");


        Hospital h2= new Hospital();
        h2.hospitalName="Malda Medical  College";
        h2.location="Malda";
        h2.numberOfDoctors=1500;
        h2.numberOfBeds=30000;
        System.out.println("Hospital Name  is : "+ h2.hospitalName);
        System.out.println("Hospital location  is : "+h2.location);
        System.out.println("number of Doctors is : "+h2.numberOfDoctors);
        System.out.println("number of Doctors is : "+h2.numberOfBeds);

        h2.details();
        System.out.println("----------------------------");


        Hospital h3= new Hospital();
        h3.hospitalName="North Bengal  Medical College";
        h3.location="North Bengal ";
        h3.numberOfDoctors=1800;
        h3.numberOfBeds=40000;
        System.out.println("Hospital Name  is : "+ h3.hospitalName);
        System.out.println("Hospital location  is : "+h3.location);
        System.out.println("number of Doctors is : "+h3.numberOfDoctors);
        System.out.println("number of Doctors is : "+h3.numberOfBeds);

        h3.details();
        System.out.println("----------------------------");


    }

}
