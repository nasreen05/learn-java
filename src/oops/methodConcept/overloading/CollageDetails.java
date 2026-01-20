package oops.methodConcept.overloading;
class CollageD{
    static  void collage(String name ){
        System.out.println("Name :"+ name);
    }
    static  void collage(String name , String dept ){
        System.out.println("Name :"+ name +" Dept :"+dept);
    }

    static  void collage(String name , String dept  , String place){
        System.out.println("Name :" + name + " Dept :" + dept + "Place :" + place);
    }
}
public class CollageDetails {
    public static void main(String[] args) {
        CollageD.collage("Aliah University");
        CollageD.collage("Aliah University","BCA");
        CollageD.collage("Aliah University","BCA","Kolkata");
    }
}
