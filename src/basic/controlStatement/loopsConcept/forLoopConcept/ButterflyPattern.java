package basic.controlStatement.loopsConcept.forLoopConcept;

public class ButterflyPattern {
    public static void main(String[] args){
      int row=7;
      int star=1;
      int spc=6;
      for(int r=1;r<=row;r++){
          for(int s=1;s<=star;s++){
        System.out.print("*");
          }
          for(int i=1;i<=spc;i++){
        System.out.print(" ");
          }
          for(int s=1;s<=star;s++){
        System.out.print("*");
          }
      System.out.println();
          if(r<row/2+1){
        star++;
        spc-=2;
          }else{
              star--;
              spc+=2;
          }
      }
    }
}
