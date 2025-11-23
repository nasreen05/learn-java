package oops.technicalPrograms;

public class StarPatternRec1 {
  static int patternRec(int n) {
    /*     if(n>0){
                patternRec(n-1);
                for(int i=n;i<6;i++){
            System.out.print("  ");
                }
                for(int i=0;i<n;i++){
            System.out.print("* ");
                }
          System.out.println();
            }
        return n;
        }
     public static void main(String[] args){
        System.out.println();
        patternRec( 5);
     }

    }*/
    /* if( n>0){
          for( int i=n;i<6;i++){
          System.out.print("  ");
          }
      for(int i=0;i<n ;i++){
          System.out.print("* ");
      }
        System.out.println();
      patternRec(n-1);
      }
      return  n;
      }
      public static void main(String[] args){
          patternRec( 6);
      }
    }*/

    /* if (n > 0) {
          patternRec(n - 1);
          for (int i = n; i < 6; i++) {
            System.out.print(" ");
          }
          for (int i = 0; i < n; i++) {
            System.out.print("*  ");
          }
          System.out.println();
        }
        return n;
      }

      public static void main(String[] args){
          System.out.println();
          patternRec(6);
    }
      }*/

    if (n > 0) {
        for(int i=n;i<6;i++){
            System.out.print(" ");

        }
      for (int i = 1; i < n; i++) {
          System.out.print("* ");
      }

     // patternRec(n-1);

      System.out.println();
        patternRec(n-1);

      }
      return n;
    }


  public static void main(String[] args) {
    System.out.println();
   patternRec(6);
      }
  }