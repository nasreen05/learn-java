package basic.array.easy;

public class CopyOneArrayAnother {
    public static void main(String[] args) {
        int [] num={12,34,56,78,98,46};
        int [] num1= new int[num.length];

        for(int i=0;i< num1.length;i++){
            num[i]=num1[i];
        }
        System.out.println("copied Array");
        for(int x :num1)
            System.out.println(x+" ");
    }
}
