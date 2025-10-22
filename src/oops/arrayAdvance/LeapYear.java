package oops.arrayAdvance;

public class LeapYear {
    public static void main(String[] args) {
        
       
        int years[] = {1600, 1700, 2000, 2023, 2024, 2100};

        
        for (int i = 0; i < years.length; i++) {
            int year = years[i];

           
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
    }
}
