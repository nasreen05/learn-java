package TechnicalPrograms;

public class FibonanciPro {
   public static void main(String[] args) {
    int f=0,r=1,s;
  System.out.print(f+" "+ r +" ");
    for(int j=1;j<=10;j++){
        s=f+r;f=r;r=s;
    System.out.print(s+" ");
    }
    }
    }

 /* static int rec(int n) {
    if (n == 1 || n == 0) {
      return n;
    } else {
      return rec(n - 1) + rec(n - 2);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      System.out.println(rec(i) + " ");
    }
  }
}*/