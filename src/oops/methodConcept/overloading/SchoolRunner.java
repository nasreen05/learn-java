package oops.methodConcept.overloading;
class SchoolRunner {

    public static void main(String[] args) {

        School school = new School("Daspara High School", 1234, "Daspara");
        System.out.println(school.getName());
        System.out.println(school.getSchoolNumber());
        System.out.println(school.getSchoolAddress());

        School school1 = new School("Delhi Public School", 2345, "Siliguri");
        System.out.println(school1.getName());
        System.out.println(school1.getSchoolNumber());
        System.out.println(school1.getSchoolAddress());
    }

    static class School {

        private String name;
        private int schoolNumber;
        private String schoolAddress;

        private Teachers teachers;   // kept as-is (assumed class exists)

        public School() {
        }

        public School(String name, int schoolNumber) {
            System.out.println("Initialize name ,schoolNumber");
            this.name = name;
            this.schoolNumber = schoolNumber;
        }

        public School(String name, int schoolNumber, String schoolAddress) {
            this(name, schoolNumber);
            System.out.println("Initialize schoolAddress");
            this.schoolAddress = schoolAddress;
        }

        public void setteachers(Teachers teachers) {
            this.teachers = teachers;
        }

        public Teachers getteachers() {
            return teachers;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSchoolNumber() {
            return this.schoolNumber;
        }

        public void setSchoolNumber(int schoolNumber) {
            this.schoolNumber = schoolNumber;
        }

        public String getSchoolAddress() {
            return this.schoolAddress;
        }

        public void setSchoolAddress(String schoolAddress) {
            this.schoolAddress = schoolAddress;
        }
    }
}
