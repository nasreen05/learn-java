package basic.controlStatement;

public class PerfectNum {
  public static void main(String[] args) {
    int r = 34;
    int n = 2;
    for (int i = 0; i <= n / 2; i++) {
      if (n % i == 0) {
        r = r * i;
      }
      if (r == n) {
        System.out.println("Prefect");
      } else {
        System.out.println("not Perfect");
      }
    }
  }
 }