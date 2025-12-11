package basic.asciiConcept;

public class AsciiCode {
    public static void main(String[] args) {
        char c='a';
        if(c=='a') {
            System.out.println("AsciiCode of a is " + c);
        } else if (c=='b') {
            System.out.println("AsciiCode of b is " + 98);
        }
        switch(c){
            case 'a' :
                System.out.println("AsciiCode  of a is "+(int)c);
                break;
            case 'b' :
                System.out.println("AsciiCode of a is "+(int)c);
                break;
            default:
                System.out.println("invalid character to print ascii value");

        }
    }
    }

