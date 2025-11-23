package oops.arrayAdvance;

public class CountDigitString {
    public static void main(String[] args) {
        
       
        String str = "Java123Programming2025";
        
        int count = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
          
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Number of digits = " + count);
    }
}
