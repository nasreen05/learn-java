package basic.array.easy;

import java.util.Arrays;

public class AscendingDescending {
    public static void main(String[] args) {
        int [] num={12,35,54,32,76,67,89,86};
        Arrays.sort(num);

        System.out.println("ascending");
        for(int x:num)
            System.out.println(x+" ");


        for(int i= num.length;i>=0;i--){
            System.out.println(num[i]+" ");
        }
    }
}
