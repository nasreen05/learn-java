package basic.starPatterns;

public class StarPattern15 {
  public static void main(String[] args) {

          int row=5;
          int str=1;
          for(int r=1; r<=row; r++){
              for(int j=1; j<=str;j++){
                  if(j==1 || j==str ||r==row ){
                      System.out.print("*");
                  }else{
                      System.out.print(" ");
                  }
              }
              System.out.println();
              str++;
          }
      }



  }

