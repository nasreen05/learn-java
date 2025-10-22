
package college;
public class Hod extends Department {

    private String hodName;
    private int hodId;

    public Hod(String collegeName, char grade,
               String departmentName, int departmentId,
               String labName, String hodName, int hodId) {
        super(collegeName, grade, departmentName, departmentId, labName);
        this.hodName = hodName;
        this.hodId = hodId;
    }

    public void showDetails() {
        System.out.println("College Name   : " + getCollegeName());
        System.out.println("Grade          : " + getGrade());
        System.out.println("Department     : " + getDepartmentName());
        System.out.println("Department ID  : " + getDepartmentId());
        System.out.println("Lab            : " + getLabName());
        System.out.println("HOD Name       : " + hodName);
        System.out.println("HOD ID         : " + hodId);
    }
}