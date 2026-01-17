package oops.dataMemberConcept;
class Bank{
    static String ceo;
    int id;
    String name;

void Details(){
    System.out.println("Id = " + id + " Details = "+ name);
    System.out.println("Ceo Name = " +ceo);

}
}
public class BankDetails {
    public static void main(String[] args) {
        Bank.ceo="Neha Nasreen";
        Bank c1=new Bank();
        c1.id=101;
        c1.name="SBI";
        c1.Details();

        Bank c2=new Bank();
        c2.id=201;
        c2.name="ICICI";
        c2.Details();
    }
}
