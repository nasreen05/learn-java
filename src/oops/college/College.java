package college;

public class College {

        private String collegeName;
        private char grade;

        public College() {}

        public College(String collegeName, char grade) {
            this.collegeName = collegeName;
            this.grade = grade;
        }

        public void setCollegeName(String collegeName) {
            this.collegeName = collegeName;
        }
        public String getCollegeName() {
            return collegeName;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }
        public char getGrade() {
            return grade;
        }
    }


