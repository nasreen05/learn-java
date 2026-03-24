package oops.inheritanceConcept.multilevel.whatsApp;

public class WhatsAppRunner {
    public static void main(String[] args) {

            WhatsAppV4 v4=new WhatsAppV4("Neha");
            v4.chat();
            v4.voiceCall();
            v4.videoCall();
            v4.payment();
        }
    }

