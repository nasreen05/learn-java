package recursion.basic;

public class PrintNumber1 {
    public static void numPrint(int num){

        if(num==0){
            return;
        }
        System.out.println(num);
        numPrint(num-1);

    }

    public static void main(String[] args) {
        int num=10;
        numPrint(num);
    }
}
