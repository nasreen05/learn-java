package basic.numberPatterns;

public class NumPattern16 {
    public static void main(String[] args){


    int row=11;
    int star=1;
    int spc=row/2;

		for(int r=1;r<=row;r++){
        for (int i = 1; i <= spc; i++) {
            System.out.print(" ");
        }

        int num =1;
        for(int s=1;s<=star;s++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        if(r<=row/2){
            star++;
            spc--;
        }else{
            star--;
            spc++;
        }

    }

}
}

