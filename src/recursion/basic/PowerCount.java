package recursion.basic;

public class PowerCount {
static  int power(int x , int n){
    if(n==0){
        return 1;

    }
    if(x==0){
        return 0;

    }
  int x1=power(x,n-1);
  int x2=x*x1;
  return  x2;

    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=power(x,n);
        System.out.println(ans);
    }
}
