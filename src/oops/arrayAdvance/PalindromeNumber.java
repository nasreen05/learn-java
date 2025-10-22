package oops.arrayAdvance;

class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1232; //not palindrome // 12321--- palindrome 
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;         
            reverse = reverse * 10 + digit;  
            number = number / 10;            
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
