package oops.classConcept;
class Neha {
    int no;
    String name;


    void details() {
        System.out.println(name + " Name or No " + no);
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Neha n= new Neha();
        n.name="Neha";
        n.no=90;
        n.details();
    }
}
