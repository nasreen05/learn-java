package oops.inheritanceConcept.heirarchicalPrograms.metaPro;

public class MetaRunner {

    public static void main(String[] args) {

        Instagram i = new Instagram("neha", "abc123", 9078);
        i.displayInstagram();

        WhatsApp w = new WhatsApp("nehaApp", "3347", 980);
        w.displayWhatsapp();
    }
}
