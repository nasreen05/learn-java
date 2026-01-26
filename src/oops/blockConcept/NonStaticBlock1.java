package oops.blockConcept;

public class NonStaticBlock1 {
    static  int count;
    NonStaticBlock1(){
        System.out.println("Constructor () excuted");
    }
    NonStaticBlock1(int i){
        System.out.println("Constructor () executed i");
    }
    NonStaticBlock1(int i , int j){
        System.out.println("constructor () executed i , j");

    }
    {
        System.out.println(" Executed all");
        count++;

    }

    public static void main(String[] args) {
        NonStaticBlock1 n1= new NonStaticBlock1();
        NonStaticBlock1 n2=new NonStaticBlock1(10);
    NonStaticBlock1 n3=new NonStaticBlock1(10,20);
        System.out.println(" total page count "+count);
    }

}
