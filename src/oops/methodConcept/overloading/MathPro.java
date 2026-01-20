package oops.methodConcept.overloading;
class Mah{
    static void add(int num1 , int num2){
        System.out.println("num1"+num1+"Num2"+num2);
    }
    static void add(int num1 , int num2, int num3){
        System.out.println("num1"+num1+"Num2"+num2);
    }
    static void add(int num1 , int num2, int num3 , int num4){
        System.out.println("num1"+num1+"Num2"+num2);
    }
}
public class MathPro {
    public static void main(String[] args) {
        Mah.add(12,3);
        Mah.add(33,45,56);
        Mah.add(34,56,78,90);
        main(new int[0]);
    }

    public static void main(int [] args) {
        System.out.println();
    }
}
