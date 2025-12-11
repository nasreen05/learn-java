package basic.array.basic;

public class OddProgram {
    public static void main(String[] args) {
        int [] num={2,3,4,5,6,7,9};
        System.out.println("Print all the odd : ");
        int odd=0;
        for(int i=0;i< num.length;i++) {
            if (num[i] % 2 != 0) {

                System.out.println("odd  :" + num[i]);
            }
        }
    }

}
