package MethodDetails;
class  MathMethod{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;

    }
double add( double a , double b, double c){
    return a+b+c;
    }
}
public class MethodOverloading1 {
    public static void main(String[] agrs){
        MathMethod m1= new MathMethod();
        System.out.println("add:"+m1.add(60,30));
        System.out.println("add:"+m1.add(40,50,60));
         System.out.println("add:"+m1.add(5.5,6.6,8.9));


    }
}
