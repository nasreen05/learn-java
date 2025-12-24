package recursion.basic;

public class ReverseNum {
public  static void NumPrint(int num){
    if(num==0){
        return;
    }
    System.out.println(num);
    NumPrint(num-1);
}
    public static void main(String[] args) {
        int num=10;
        NumPrint(num);

    }
}
