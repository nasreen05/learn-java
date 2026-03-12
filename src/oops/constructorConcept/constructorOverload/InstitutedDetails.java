package oops.constructorConcept.constructorOverload;
class Instituted{
    int id;
    String insName;
    String place;

    public Instituted(int id ) {
        this.id = id;
    }
    public Instituted( int id, String insName) {
        this.id = id;
        this.insName = insName;
    }
    public Instituted(int id , String insName, String place){
        this.id = id;
        this.insName = insName;
        this.place=place ;
    }
}
public class InstitutedDetails {
    public static  void displayDetails(Instituted e) {
        System.out.println(" Id is :"+ e.id);
        System.out.println("insName is :"+ e.insName);
        System.out.println(" place :"+e.place);
        System.out.println("=====================");
    }
    public  static void main(String[]args){
        Instituted e1= new Instituted(101,"Jspeider","Kolkata");
        displayDetails(e1);
        Instituted e2= new Instituted(102,"Qspeider","Delhi");
        displayDetails(e2);
        Instituted e3= new Instituted(103,"PSpeider","Mumbai");
        displayDetails(e3);
        Instituted e4= new Instituted(104,"Dspeider","Chennai");
        displayDetails(e4);

    }
}
