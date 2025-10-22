package oops.arrayAdvance;

public class CountWhiteSpaces {
    public static void main(String[] args) {
        
        
        String str = "Java Programming Language Example";
        
        int count = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
           
            if (ch == ' ') {
                count++;
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Number of white spaces = " + count);
    }
}
