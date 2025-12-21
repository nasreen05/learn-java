package recursion.basic;

public class SerialNumber {
    public  static void numPrint(int num){
     if(num==6){
         return;
     }
        System.out.println(num);
        numPrint(num+1);
    }

    public static void main(String[] args) {
     int num=1;
     numPrint(num);

    }
}
