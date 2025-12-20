package oops.classOopsTopic;

import javax.rmi.CORBA.Stub;

class Collage {
    static  String nameCollage;
    String place;
    int id;

    void idCard(){
        System.out.println("Collagename ="+nameCollage);
        System.out.println("place ="+place);
        System.out.println("id ="+id);

    }
}
class student{
    public static void main(String[] args) {
        Collage.nameCollage="Aliah University";

        Collage s1=new Collage();
        s1.id=1;
        s1.place="Kolkata";

       // s1.idCard();-----------for s1 collage name will be Aliah
      //   s1.nameCollage="MumbaiCollage";------------both student collage name= MumbaiCollage

        Collage s2= new Collage();
        s2.place="Delhi";
        s2.id=2;


        s1.idCard();
        s2.idCard();

    }
}
