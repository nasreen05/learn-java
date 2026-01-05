package oops.interfaceConcept.library;
 class Employee1 {

        private String name;
        private int id;
        private double salary;

        public Employee1(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee1 [Name=" + name + ", ID=" + id + ", Salary=" + salary + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Employee1) {
                Employee1 e = (Employee1) obj;
                return this.id == e.id && this.name.equals(e.name);
            }
            return false;
        }
    }

