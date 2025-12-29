package oops.methodConcept.overloading;
class MathCalculation{
    static  void sum(int i , int o) {
        int result = i + o;
        System.out.println("result" + result);
    }
        static void sum(int i, int o , int p){
        int result= i+o+p;
            System.out.println("result"+result);
        }
        static  void sum(int i , int o , int p , int q){
        int result= i+o+p+q;
            System.out.println("result"+result);
        }

}
public class Math {
    public static void main(String[] args) {

        MathCalculation sum1=new MathCalculation();
        MathCalculation.sum(20,30);
        MathCalculation.sum(10,20,30);
        MathCalculation.sum(20,30,40,50);
    }
}
