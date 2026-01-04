package oops.methodConcept.overloading;

public class PracticeRunner2 {
    public static void sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("result =" + result);
    }
}
class Practice1{
    public static void main(String[] args) {
        int arr[]={20,40,50,60,70};
        PracticeRunner2.sum(arr);
        PracticeRunner2.sum(new int[]{20,30,40});
        PracticeRunner2.sum(new int[]{90,80,70,60});
    }
    }
