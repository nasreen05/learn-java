package recursion.basic;


public class PrintNumber {
    public static void numberPrint(int num){
        if(num==0){
            return;
        }


        System.out.println(num);
        numberPrint(num-1);
    }


    public static void main(String[] args) {
     int num=5;
     numberPrint(num);
    }







}
