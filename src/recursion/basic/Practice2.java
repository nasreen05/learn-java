package recursion.basic;

public class Practice2 {
public static void NumPrint(int num ){
    if(num==6){
        return;
    }
    System.out.println(num);
    NumPrint(num+1);
    }
    public static void main(String[] args) {
        int num=1;
        NumPrint(num);

    }
}
