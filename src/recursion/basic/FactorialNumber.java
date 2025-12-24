package recursion.basic;

public class FactorialNumber {
    static int factorial(int n) {
        // Base condition
        if (n == 0)
            return 1;

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}