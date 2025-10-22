package basic.controlStatement;

public class BreakPro {
  public static void main(String[] args) {

    // Break and Continue using  For Loops !

    /*     for(int i=0;i<5;i++){
          System.out.println(i);
          System.out.println("Java is great");
          if(i==2){
            System.out.println("Ending the loop");
            break;
          }
            }
        System.out.println("Loop ends here");
        }
    } */

    // Break and Continue using  While Loop !

    /*   int i=0;
          while(i<5){
          System.out.println(i);
          System.out.println("Java is Great");
          if(i==2){
            System.out.println("Ending the Loop");
            break;
          }
          i++;

        }
        System.out.println("Loop ends here");
      }
    }

        */

    // Break and Continue using  For Loops !
    /*
          int i=0;
      do{
          System.out.println("Java is Great");
              if(1==3){
                  System.out.println("Java is Platform Independent");
                  break;
                  }
          i++;
          }while (1<5);
          System.out.println("End");
    }
      }
      */

    /*   for (int i = 0; i < 50; i++) {
        if (i == 2) {
          System.out.println("Ending the Loop");
          continue;
        }
        System.out.println(i);
        System.out.println("Java is great");
      }
    }
    }*/

    int i = 0;
    do {
      System.out.println(i);
      System.out.println("Java is great");
      if (i == 2) {
        System.out.println("Ending the Loop");
        continue;
      }

      System.out.println(i);
      System.out.println("Java is great");
      i++;
    } while (i < 5);
    System.out.println("Loop ends here");
}
      }



























