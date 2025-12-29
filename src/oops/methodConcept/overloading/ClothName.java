package oops.methodConcept.overloading;
class Cloth{
    static  void Name(String name){
        String rwsult=name;
        System.out.println(rwsult);
    }
}
public class ClothName {
    public static void main(String[] args) {
     //   Cloth c1=new Cloth();
        Cloth.Name("Neha cloth store");
    }
}
