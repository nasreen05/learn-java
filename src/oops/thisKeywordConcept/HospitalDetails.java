package oops.thisKeywordConcept;
class Hospital{
    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfBeds;

    public Hospital(String hospitalName , String location, int numberOfBeds,int numberOfDoctors ) {
        this.hospitalName = hospitalName;
        this.location= location;
        this.numberOfBeds=numberOfBeds;
        this.numberOfDoctors=numberOfDoctors;
    }
}
public class HospitalDetails {
    public static void displayDetails(Hospital e) {
        System.out.println(" HOSPITAL NAME :" + e.hospitalName);
        System.out.println("LOCATION :" + e.location);
        System.out.println("NUMBER OF BED :" + e.numberOfBeds);
        System.out.println("NUMBER OF DOCTORS :" + e.numberOfDoctors);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Hospital e1 = new Hospital("kolkata medical collage ", "kolkata ", 19290, 5000);
        displayDetails(e1);
        Hospital e2 = new Hospital("Malda medical collage", "malda", 1200,  6000);
        displayDetails(e2);
        Hospital e3 = new Hospital("North bengal medical collage ", "North Bengal ", 3000, 20000);
        displayDetails(e3);
    }

}