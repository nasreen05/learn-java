package oops.arrayAdvance;

public class SmallestDigit {
    public static void main(String[] args) {
        
        int number = 5839724;   
        int smallest = 9;     
        
        int temp = number;
        
       
        while (temp > 0) {
            int digit = temp % 10; 
            
           
            if (digit < smallest) {
                smallest = digit;
            }
            
            temp = temp / 10;  
        }
        
        System.out.println("Number: " + number);
        System.out.println("Smallest digit = " + smallest);
    }
}
