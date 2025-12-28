package recursion.basic;

class FactorialRecursion {

    // recursive method
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // base case
        } else {
            return n * factorial(n - 1);  // recursive step
        }
    }

    public static void main(String[] args) {
        int num = 5;   // change number here
        int result = factorial(num);

        System.out.println("Factorial of " + num + " using recursion = " + result);
    }
}
