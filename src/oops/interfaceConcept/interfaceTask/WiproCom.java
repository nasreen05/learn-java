package InterfaceTask;

public class WiproCom implements  Company {
        int Id, salary;

        public WiproCom() {}

        public WiproCom(int Id, int salary) {
            this.Id = Id;
            this.salary = salary;
        }

        @Override
        public void companyId(int id) {
            Id = id;
        }

        @Override
        public void employeId(int eid) {
            Id = Id + eid;
        }

        @Override
        public void salary(int sal) {
            Id = Id - sal;
        }

        public String printStates() {
            return "States of Company is id" + Id + "salary" + salary;
        }
    }


