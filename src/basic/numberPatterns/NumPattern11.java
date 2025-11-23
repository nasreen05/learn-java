package basic.numberPatterns;

public class NumPattern11 {
    public static void main(String[] args){
    int row=5;
    int star=1;
    int num=1;

		for(int r=1;r<=row;r++){
        int  tem=num;
        for(int i=1;i<=star;i++){
            System.out.print(tem+" ");
            tem--;
        }
        System.out.println();
        star++;
        num++;
    }
}
}

