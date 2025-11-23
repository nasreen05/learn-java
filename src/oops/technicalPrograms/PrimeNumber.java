package oops.technicalPrograms;

public class PrimeNumber {
  public static void main(String[] args) {
    int n = 7;
    boolean flag = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        flag = false;
        System.out.println(n + " is Not Prime");

        break;
      }
      }
      if (flag) {
        System.out.println("Prime");
      }
    }
  }

            /*   int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }

            if (count == 2)
                System.out.println(n + " is Prime");
            else
                System.out.println(n + " is Not Prime");
        }
    }*/




