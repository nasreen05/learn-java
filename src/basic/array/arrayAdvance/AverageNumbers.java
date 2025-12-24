package basic.array.arrayAdvance;

public class AverageNumbers {
    public static void main(String[] args) {
        
       
        int numbers[] = {10, 20, 30, 40, 50};
        int n = numbers.length;   
        
        int sum = 0;
        
        
        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }
        
        
        if (n > 0) {
            double average = (double) sum / n;
            System.out.println("Average of " + n + " numbers = " + average);
        } else {
            System.out.println("No numbers to calculate average");
        }
    }
}
