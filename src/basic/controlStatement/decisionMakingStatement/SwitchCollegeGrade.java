package basic.controlStatement.decisionMakingStatement;

class SwitchCollegeGrade {
    public static void main(String[] args) {

        int marks = 85; 			//initial

        
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        
        String grade = "";

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        switch (grade) {
            case "A+":
                System.out.println("Excellent performance");
                break;
            case "A":
                System.out.println("Very Good");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Satisfactory");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "F":
                System.out.println("Failed - Better luck next time");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
