package recursion.basic;

public class School {
    public static void namePrint(int count){
        if(count==0){
            return;
        }

        System.out.println("High School");
        namePrint(count-1);
    }
    public static void main(String[] args) {
   namePrint(5);

    }
}
