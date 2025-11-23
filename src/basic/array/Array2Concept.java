package basic.array;

public class Array2Concept {
  public static void main(String[] args) {
      String [][] names={
              {"Neha","Reshma","Nasreen"},
              {"Jiya","Ptiya", "Shiya"},
              {"Rafia","Sneha","Tanue"}
      };

      for(int i=0;i<names.length;i++){
      for(int j=0;j<names[i].length;j++){
          System.out.print(names[i][j]+" ");
      }
      System.out.println();
  }

      }
}