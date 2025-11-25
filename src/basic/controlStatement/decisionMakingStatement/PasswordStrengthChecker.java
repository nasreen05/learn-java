package basic.controlStatement.decisionMakingStatement;

public class PasswordStrengthChecker {
    public static void main(String[] args){
        String password="Neha@123";
        int length=password.length();

        boolean hasLower=false;
        boolean hasUpper=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;

        for(int i=0;i<password.length();i++){
            char ch= password.charAt(i);

                if(Character.isLowerCase(ch)) {
                    hasLower = true;
                }
                else if(Character.isUpperCase(ch)) {
                    hasUpper = true;
                }
                else if(Character.isDigit(ch)) {
                    hasDigit = true;
                }
                else {
                    hasSpecial = true;
                }
            }

            // 1. Very Weak
            if(length < 6) {
                System.out.println("Very Weak");
            }
            // 2. Weak → only letters
            else if((hasLower || hasUpper) && !hasDigit && !hasSpecial) {
                System.out.println("Weak");
            }
            // 3. Medium → letters + digits
            else if((hasLower || hasUpper) && hasDigit && !hasSpecial) {
                System.out.println("Medium");
            }
            // 4. Strong → letters + digits + special
            else if((hasLower || hasUpper) && hasDigit && hasSpecial) {
                System.out.println("Strong");
            }
            // 5. Very Strong → uppercase + lowercase + digit + special
            if(hasLower && hasUpper && hasDigit && hasSpecial && length >= 6) {
                System.out.println("Very Strong");
            }
        }
    }
