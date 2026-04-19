package advance.exceptionConcept.nullPointer;

public class Test {
    public static void main(String[] args) {
        try {
            String s=null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            //Cannot invoke "String.length" because "s" is null
        }
    }
}
