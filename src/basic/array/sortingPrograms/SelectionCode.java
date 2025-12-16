package basic.array.sortingPrograms;

public class SelectionCode {
    public static void main(String[] args) {
        int[] num = {2, 9, 5, 3,  4, 1, 8};

        for(int i=0;i< num.length-1;i++){

            for( int j=i+1;j< num.length;j++){
                if(num[j]<num[i]){
                    int temp=num[j];
                    num[j]=num[i];
                    num[i]=temp;

                }
            }

        System.out.println("After short");
        for (int x : num)
            System.out.println(x);

        }
    }
}