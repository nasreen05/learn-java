package oops.inheritanceConcept.multilevel.whatsApp;

public class WhatsAppV3  extends  WhatsAppV1{
    public WhatsAppV3(String name){
        super(name);
    }
    public void status(){
        System.out.println(name+"is update status.....");
    }
}
