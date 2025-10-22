package InterfaceTask;

public class CompanyRunner {
    public static void main(String[]args){

    InfosysCom infosysCom = new InfosysCom();
        System.out.println(infosysCom.Id);
        System.out.println(infosysCom.salary);



        infosysCom.companyId(10);
        infosysCom.employeId(10);
        infosysCom.salary(10);


        System.out.println(infosysCom.printStates());
    WiproCom wiproCom = new WiproCom();
    Company company = new WiproCom(10, 12000);
        company.companyId(20);
        company.employeId(30);

    }
}
