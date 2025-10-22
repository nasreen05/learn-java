package basic.array;

public class Exercise4 {
  // Create a java program to add two  matrix of size 2 x 3;

  public static void main(String[] args){
      int[][] num1={{2,3,4},{4,5,6}};

      int [][] num2={{3,4,5},{5,6,7}};

      int [][] result={{0,0,0},{0,0,0}};

      for( int i=0;i<num1.length;i++){ // row number of times
          for(int j=0;j<num1[i].length;j++){    // coloum number of time
              System.out.format("Setting value for i=%d and j=%d\n",i,j);
              result[i][j]=num1[i][j]+ num2[i][j];
             }
          }
      // Printing the element of 2-D array
              for( int i=0;i<num1.length;i++){ // row number of times
                  for(int j=0;j<num1[i].length;j++){  // colum number of time
        System.out.print(result[i][j] +" ");
                      result[i][j]=num1[i][j]+ num2[i][j];

      }
      System.out.println(""); //Print a new line
    }
              }
              }