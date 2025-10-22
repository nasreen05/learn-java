package oops.arrayAdvance;

class College {
    private String collegeName;
    private float passPercentage;
    private char grade;
    private boolean isNAAC;

    long[] registrationIds = {10001L, 10002L, 10003L};
    short[] departmentNum = {5, 6, 7};
    byte[] floors = {2, 3, 4};
    static double[] courseFees = {25000.50, 30000.75, 27500.25};
    
    
    public static double[] getCourseFees() {  // Static method to return course fees
        return courseFees;
    }

   
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    
    public float getPassPercentage() {
        return passPercentage;
    }

    public void setPassPercentage(float passPercentage) {
        this.passPercentage = passPercentage;
    }

 
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

   
    public boolean getisNAAC() {
        return isNAAC;
    }

    public void setNAAC(boolean isNAAC) {
        this.isNAAC = isNAAC;
    }
}
