package basic.array.arrayEasy;

public class CompareReplace {
    public static void main(String[] args) {
        int[] num = {2, 4, 7, 6, 9, 8};
        int mid = num.length / 2;


        if (num[0] < num[mid]){
            int   temp=num[0];
            num[0] = num[mid];
            num[mid]=temp;
    }
        System.out.println("After the  Replace");
        for(int x: num) {
            System.out.println(x);
        }
    }
}