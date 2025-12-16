package basic.array.arrayEasy;

public class Replace {
    public static void main(String[] args) {
        int [] num={2,4,7,6,9,8};

        int mid= num.length/2;
        int last=num.length-1;




        int temp = num[mid];
        num[mid] = num[last];
        num[last] = temp;
        System.out.println("After the  Replace");
        for(int x: num) {
            System.out.println(x);
        }
    }
}
