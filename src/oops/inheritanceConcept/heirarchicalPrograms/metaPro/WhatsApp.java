package oops.inheritanceConcept.heirarchicalPrograms.metaPro;
public class WhatsApp extends Meta {

    int noOfContacts;

    public WhatsApp(String userName, String password, int noOfContacts){
        super(userName, password);
        this.noOfContacts = noOfContacts;
    }

    public void displayWhatsapp(){
        System.out.println("WhatsApp details are");
        System.out.println("User name is: " + userName);
        System.out.println("Password is: " + password);
        System.out.println("No of contacts: " + noOfContacts);
        System.out.println("--------------------------");
    }
}


