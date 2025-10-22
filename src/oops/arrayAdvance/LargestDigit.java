package oops.arrayAdvance;

public class LargestDigit {
    public static void main(String[] args) {
        
        int number = 5839724; 
        int largest = 0;
        
        int temp = number;
        
      
        while (temp > 0) {
            int digit = temp % 10;  
            
            
            if (digit > largest) {
                largest = digit;
            }
            
            temp = temp / 10;  
        }
        
        System.out.println("Number: " + number);
        System.out.println("Largest digit = " + largest);
    }
}
