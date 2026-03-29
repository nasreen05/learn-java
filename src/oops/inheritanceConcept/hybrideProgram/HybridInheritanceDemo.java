package oops.inheritanceConcept.hybrideProgram;

public class HybridInheritanceDemo {
    public static void main(String[] args) {

        TE te = new TE();
        te.getPerson("Rahul", 25);
        te.getEmployee(101);
        te.getTE(50);

        System.out.println("---- TE Details ----");
        te.showPerson();
        te.showEmployee();
        te.showTE();

        CSDept cs = new CSDept();
        cs.getPerson("Riya", 20);
        cs.getStudent("Full Time");

        System.out.println("\n---- CS Student ----");
        cs.showPerson();
        cs.showStudent();
        cs.showCS();

        Businessman b = new Businessman();
        b.getPerson("Amit", 40);
        b.getBusiness(500000);

        System.out.println("\n---- Businessman ----");
        b.showPerson();
        b.showBusiness();
    }
}