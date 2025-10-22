package oops.arrayAdvance;

public class ReverseEachWord {
    public static void main(String[] args) {
        
        
        String str = "Java Programming Language";
        String result = "";
        
        String word = "";
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ') {
            
                word = word + ch;
            } else {
             
                for (int j = word.length() - 1; j >= 0; j--) {
                    result = result + word.charAt(j);
                }
                result = result + " ";  
                word = ""; 
        }
        
       
        for (int j = word.length() - 1; j >= 0; j--) {
            result = result + word.charAt(j);
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Reversed Each Word: " + result);
    }
}
}

