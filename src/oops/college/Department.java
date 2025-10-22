package college;

public class Department  extends  College {

        private String departmentName;
        private int departmentId;
        private String labName;

        public Department() {
            // Default constructor
        }

        public Department(String collegeName, char grade,
                          String departmentName, int departmentId, String labName) {
            super(collegeName, grade);
            this.departmentName = departmentName;
            this.departmentId = departmentId;
            this.labName = labName;
        }

        // Getters and Setters
        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setLabName(String labName) {
            this.labName = labName;
        }

        public String getLabName() {
            return labName;
        }
    }


