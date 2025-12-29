package oops.methodConcept.overloading;
class Calculate{
    static void math(int [] arr){
        int result=0;
        for(int i=0;i< arr.length;i++){
            result +=arr[i];
        }
        System.out.println("result"+result);
    }
}
public class Calculation {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        Calculate.math(arr);
        Calculate.math(new int[]{10,20,30});
        Calculate.math(new int[]{20,30,30,80});
    }
}
