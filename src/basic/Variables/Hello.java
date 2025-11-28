package basic.Variables;

public class Hello {
    public static void main(String[] args){
        String name=args[0];
        String wishes= goodMorningWishes(name);
    System.out.println(wishes);
    }
    //parameterized variable
    //Parameter method / argument method
    public static String goodMorningWishes(String name){
        return "Good morning "+name;
    }
}
