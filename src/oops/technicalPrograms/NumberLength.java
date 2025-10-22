package TechnicalPrograms;

public class NumberLength {
    public static void main(String[] args){
        int n=9876;
        int count=0;
        for(int i=0;i<=n;i++){
            count++;
            n=n/10;
            }
      System.out.println(count);
        
    }
}
