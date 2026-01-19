package oops.methodConcept.technicalPrograms;
class MyMathAlgo{
    static int getFactValue(int num){
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact *= i;
        }
        return fact;
        }
    }
public class TestMath {
    public static void main(String[] args) {
int result=MyMathAlgo.getFactValue(5);
        System.out.println(result);
    }
}
