package library;

public class Student {
        private String name;
        private int rollNo;
        private double marks;

        public Student(String name, int rollNo, double marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student [Name=" + name + ", RollNo=" + rollNo + ", Marks=" + marks + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Student) {
                Student s = (Student) obj;
                return this.rollNo == s.rollNo && this.name.equals(s.name);
            }
            return false;
        }
    }

