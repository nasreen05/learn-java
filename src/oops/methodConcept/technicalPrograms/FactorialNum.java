package oops.methodConcept.technicalPrograms;
class FactNum {
    static int countFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        return fact;
    }
}
    public class FactorialNum {
        public static void main(String[] args) {
            int result= FactNum.countFact(5);
            System.out.println(result);
        }
    }

