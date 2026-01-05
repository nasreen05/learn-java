package oops.exceptionConcept;

public class InvalidNumber {
    public static void main(String[] args) throws NumberNegativeException {
        int number = 0;
//        try {
        checkNumber(number);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
    public static void checkNumber(int number) throws NumberNegativeException, ArithmeticException {
        if (number <0) {
            System.out.println("Invalid number");
            throw new NumberNegativeException();
        } else {
            System.out.println("Valid number");
        }
    }
}
// throw - we write in throw inside a method
// throw keyword followed by new construcor(Excpetion name)
// with throw keyword we can send one exception .

// throws- we write throws in method signature
// throws followed by excpetion name
// with throws keyword we can have mutiple exception name comma separated
