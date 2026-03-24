package oops.inheritanceConcept.multilevel.whatsApp;

public class WhatsAppV2  extends  WhatsAppV1 {
public  WhatsAppV2(String name){
    super(name);
}
public void voiceCall(){
    System.out.println(name+"is voice call");
}
public void videoCall(){
    System.out.println(name+"is video call ");
}
}
