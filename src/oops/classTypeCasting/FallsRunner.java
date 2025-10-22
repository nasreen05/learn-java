package ClassTypeCasting;
class Falls{

}
class JogFalls extends  Falls{

}
class AbbeFalls extends  Falls{

}

public class FallsRunner {
public static void main(String[]args){

    Falls falls = new AbbeFalls();

    System.out.println(falls instanceof  JogFalls);
    System.out.println(falls instanceof  AbbeFalls);

    AbbeFalls abbeFalls=(AbbeFalls) falls;
    JogFalls jogFalls=(JogFalls)  falls;
}
}
