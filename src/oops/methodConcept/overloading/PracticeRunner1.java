package oops.methodConcept.overloading;

public class PracticeRunner1 {
    public static void sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result +=arr[i];
        }
        System.out.println("result" + result);
    }
}
class Practice{
    public static void main(String[] args) {
        PracticeRunner1.sum(new int[]{23,35,56,78});
        PracticeRunner1.sum(new int[]{45,67,89});
        PracticeRunner1.sum(new int[]{23,45});

    }

    }

