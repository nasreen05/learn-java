package basic.array.arrayAdvance;

public class CountConsonants {
    public static void main(String[] args) {
        
        
        String str = "Java Programming Language";
        
        int count = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
           
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
              
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                      ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    count++;
                }
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Number of consonants = " + count);
    }
}
