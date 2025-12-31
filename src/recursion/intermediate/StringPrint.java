package recursion.intermediate;

public class StringPrint {
    static  void PrintName(int count){
       if(count ==0){
           return;
       }
        System.out.println("Reshma Nasreen");
     PrintName(count-1);
    }
    public static void main(String[] args) {
     PrintName(5);
    }
}
