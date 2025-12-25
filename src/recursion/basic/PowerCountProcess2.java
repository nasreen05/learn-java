package recursion.basic;

public class PowerCountProcess2 {
    static int powerC(int x , int n){
        if(n==0){         //base case 1
            return 1;
        }
        if(x==0){       //base case 2
            return 0;
        }
        if(n%2==0){       // even
           return powerC(x,n/2)*powerC(x,n/2);
        }
        else {         //odd
            return powerC(x,n/2)* powerC(x,n/2)*x;
        }
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=powerC(x,n);
        System.out.println(ans);
    }
}
