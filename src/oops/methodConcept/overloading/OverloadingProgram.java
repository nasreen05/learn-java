package oops.methodConcept.overloading;
class Overloading {
    static void sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("result" + result);

    }
}
 class OverloadingProgram{
     public static void main(String[] args) {
           Overloading.sum(12,34);
 }
}
