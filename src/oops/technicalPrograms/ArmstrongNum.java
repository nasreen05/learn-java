package oops.technicalPrograms;

public class ArmstrongNum {
  public static void main(String[] args) {
    int n = 9474;
    int p = n;
    int r, sum = 0;

    while (p > 0) {
      r = p % 10;
      sum = sum + r * r * r * r;
      p = p / 10;
    }
    if (sum == n) {
      System.out.println("Armstrong");
    } else {
      System.out.println("not Armstrong");
    }
  }
     }