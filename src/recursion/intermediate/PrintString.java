package recursion.intermediate;

public class PrintString {
    static void nameP(String st, int  idx){

    if(idx==0){
        System.out.println(st.charAt(idx));
        return;
    }
        System.out.print(st.charAt(idx));
    nameP(st, idx-1);

    }

    public static void main(String[] args) {
    String st="Neha";
    nameP(st,st.length()-1);
    }
}