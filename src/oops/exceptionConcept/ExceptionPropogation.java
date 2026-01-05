package oops.exceptionConcept;

public class ExceptionPropogation {
    public static void main(String[] args) {
        computeDivision();
        //

    }
    // Exception - user defined exception
    public static void computeDivision() {
        try {
            divide();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            System.out.println("this is finally block");
        }
    }

    public static void divide() {
        int a = 100;
        int b = 20;
        int result = a / b;
        System.out.println(result);
    }
}


