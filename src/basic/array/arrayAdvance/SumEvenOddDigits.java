package basic.array.arrayAdvance;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        
        int number = 4837295;   
        int evenSum = 0;
        int oddSum = 0;
        
        int temp = number;
        
        
        while (temp > 0) {
            int digit = temp % 10; 
            
        
            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }
            
            temp = temp / 10;  
        }
        
        System.out.println("Number: " + number);
        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Sum of odd digits  = " + oddSum);
    }
}
