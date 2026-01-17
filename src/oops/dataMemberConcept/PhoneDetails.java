package oops.dataMemberConcept;
class Phone{
    static String company;
    int id;
    String name;

    void Details(){
        System.out.println("Name of Company : " + company);
        System.out.println("ID :" + id + " Name " + name);
    }
}
public class PhoneDetails {
    public static void main(String[] args) {
        Phone.company="Apple";
        Phone p1=new Phone();
        p1.id=101;
        p1.name="mackbook";
        p1.Details();

        Phone p2=new Phone();
        p2.id=202;
        p2.name="iPhone";
        p2.Details();

    }
}
