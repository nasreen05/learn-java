package recursion.basic;

public class namePrint {
    public static void nameSchool(int count){
        if(count==0){
            return;

        }
        System.out.println("Reshma Nasreen");
        nameSchool(count-1);

    }
    public static void main(String[] args) {
     nameSchool(5);
    }
}
