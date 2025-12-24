package recursion.basic;

public class NaturalNumber {
public static void naturalNum(int i , int n, int sum) {
if(i==n){
    sum+=i;
    System.out.println(sum);
    return;
}
sum+=i;
naturalNum(i+1,n,sum);
    System.out.println(i);
}

    public static void main(String[] args) {
        naturalNum(1,5,0);

    }
}

