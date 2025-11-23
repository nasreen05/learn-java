package basic.alphabatePattern;

public class AlphaPattern2 {
    public static void main(String[] args){
       int row=5;
       int star=1;
       char ch='A';
       for(int r=1;r<=row;r++){
           for(int s=1;s<=star;s++){
        System.out.print(ch+" ");
           }
      System.out.println();
       star++;
       ch++;
       }

    }
}
