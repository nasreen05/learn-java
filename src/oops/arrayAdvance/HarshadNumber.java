package oops.arrayAdvance;

public class HarshadNumber {
    public static void main(String[] args) {
        
        int number = 18;  
        int temp = number;
        int sum = 0;
       
        while (temp > 0) {
            int digit = temp % 10;  
            sum = sum + digit;      
            temp = temp / 10;       
        }
        
        
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }
    }
}
