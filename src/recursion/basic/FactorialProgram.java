package recursion.basic;

public class FactorialProgram {
    static  int calFact(int n){

        if(n==1 || n==0){
            return 1;

        }
        int fact1=calFact(n-1);
        int fact2=n*fact1;
        return  fact2;
    }

    public static void main(String[] args) {
        int ans=calFact(5);
        System.out.println(ans);
    }
}
