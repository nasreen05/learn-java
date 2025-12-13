package basic.array.arrayEasy;

public class SwapFirstElement {
    public static void main(String[] args) {
         int [] num={1,2,5,6,7};
         int temp =num[0];

        num[0] = num[num.length - 1];
        num[num.length - 1] = temp;

        System.out.println("After swapping:");
        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}