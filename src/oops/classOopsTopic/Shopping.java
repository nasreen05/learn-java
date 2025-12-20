package oops.classOopsTopic;

public class Shopping {
    static  String nameMall;
    String place;
    int  id;

    void mallDetails(){
        System.out.println("MallName ="+nameMall);
        System.out.println("Place ="+place);
        System.out.println("Id ="+id);
    }
}
class Emp{
    public static void main(String[] args) {
         Shopping.nameMall="CityMall";

         Shopping s1=new Shopping();
         s1.place="Kolkata";
         s1.id=101;

         Shopping s2=new Shopping();
         s2.place="Delhi";
         s2.id=102;


         s1.mallDetails();
         s2.mallDetails();
    }
}