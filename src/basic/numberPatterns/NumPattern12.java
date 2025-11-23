package basic.numberPatterns;

public class NumPattern12 {
    public static void main(String[] args){
    int row=5;
    int star=1;
    int num=1;
    for(int r=1;r<=row;r++){
        int temp=num;
        for(int s=1;s<=star;s++){
        System.out.print(temp+" ");
        temp+=5;
        }
      System.out.println();
        star++;
        num++;
    }
    }
}