package MethodDetails;
class Animal2{
    void sound(){
        System.out.println("Animal makes sound ");
    }
}
class  Dog2 extends Animal2{
    void sound(){
        System.out.println("Dog baow");
    }
    void  guard(){
        System.out.println("Dogs guard ");
    }
}
public class TypeCasting {
    public static void main(String[]args){
        Animal2 a= new Dog2();
        a.sound();

        Dog2 d= (Dog2)a;
        d.guard();
        d.sound();
    }

}
