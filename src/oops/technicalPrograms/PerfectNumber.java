package TechnicalPrograms;

public class PerfectNumber {
  public static void main(String[] args) {
      int num=98;
      int r=0;
      for(int i=1;i<=num/2;i++){
          if(num%i==0){
              r=r+i;
          }
          }
          if(r==num){
        System.out.println("Perfect");
      }else{
        System.out.println("not Prefect");
          }
      }

  }
















  /*  int n = 28;
    int r = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        r = r + i;
      }
    }
    if (r == n) {
      System.out.println("Perfect");
    } else {
      System.out.println("not a Perfect");
    }
  }
}*/
