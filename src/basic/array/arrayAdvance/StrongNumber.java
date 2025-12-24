package basic.array.arrayAdvance;

public class StrongNumber {
    public static void main(String[] args) {
        
        int number = 145;   
        int temp = number;
        int sum = 0;
        
       
        while (temp > 0) {
            int digit = temp % 10;  
            
           
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            
            sum = sum + fact;  
            temp = temp / 10; 
        }
     
        if (sum == number) {
            System.out.println(number + " is a Strong Number");
        } else {
            System.out.println(number + " is NOT a Strong Number");
        }
    }
}
