package recursion.advance;

public class NumberOfWays {
    public static int printW(int n){
        if(n<=1) {
            return 1;
        }
        int ways=printW(n-1);
        int ways1=(n-1) * printW(n-2);

        return  ways+ways1;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(printW(n));
    }
}
