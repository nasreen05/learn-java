package MethodDetails;
class Animal1{
    void sound(){
        System.out.println("Animal makes sound");

    }
}
class  Dog1 extends Animal1{
    @Override

    void  sound(){
        System.out.println("dog baow");
    }
void guard(){
        System.out.println("Dog guard ");
}

}

public class MethodChaining1 {
    public static void main(String[]args){
        Animal1 a=new Dog1();
          a.sound();

          Dog1 d=(Dog1)a;
          d.guard();
          a.sound();

        }

}
