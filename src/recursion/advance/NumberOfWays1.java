package recursion.advance;

public class NumberOfWays1 {

    public static int  printWays(int k){
        if(k<=1){
            return 1;
        }
        int ways1=printWays(k-1);
        int ways2=(k-1) *printWays(k-2);
        return  ways1+ways2;
    }
    public static void main(String[] args) {
      int k=4;
        System.out.println(printWays(k));
    }
}
