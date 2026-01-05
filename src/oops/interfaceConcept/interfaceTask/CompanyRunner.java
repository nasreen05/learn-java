package oops.interfaceConcept.interfaceTask;

public class CompanyRunner {
    public static void main(String[]args){

    InterfaceTask.InfosysCom infosysCom = new InterfaceTask.InfosysCom();
        System.out.println(infosysCom.Id);
        System.out.println(infosysCom.salary);



        infosysCom.companyId(10);
        infosysCom.employeId(10);
        infosysCom.salary(10);


        System.out.println(infosysCom.printStates());
    InterfaceTask.WiproCom wiproCom = new InterfaceTask.WiproCom();
    InterfaceTask.Company company = new InterfaceTask.Company() {
        @Override
        public void companyId(int companyName) {

        }

        @Override
        public void employeId(int employeId) {

        }

        @Override
        public void salary(int salary) {

        }
    };
        company.companyId(20);
        company.employeId(30);

    }
}
