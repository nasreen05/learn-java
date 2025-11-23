package basic.numberPatterns;

public class NumPattern5 {
    public static void main(String[] args){
        int row=11;
        int star=5;
        int num=5;
        for(int r=1;r<=row;r++){
            int temp=num;
            for(int s=1;s<=star;s++){
        System.out.print(temp+" ");
        temp++;
            }
            System.out.println();
            if(r<=row/2){
                star--;
                num--;
                }else if(r==row/2){
            }
else{
    star++;
    num++;
            }
            }
    }
}
