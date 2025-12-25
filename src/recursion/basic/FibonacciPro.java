package recursion.basic;

public class FibonacciPro {
    static  int fibonacciNum(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacciNum(n - 1) + fibonacciNum(n - 2);
    }
    public static void main(String[] args) {
        int num=10;
     for(int i=0;i<num;i++){
         System.out.println(fibonacciNum(i));
     }
    }
}
