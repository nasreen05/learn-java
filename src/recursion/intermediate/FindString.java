package recursion.intermediate;

public class FindString {
    public static int first=-1;
    public static  int last=-1;

    public  static void  findOccarence(String st, int idx, char Character){
        if(idx==st.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char current =st.charAt(idx);
        if(current == Character){
            if(first ==-1){
                first =idx;
            }else{
                last=idx;
            }

        }
        findOccarence(st, idx+1,Character);

    }

    public static void main(String[] args) {
        String st="abaacdaefaah";
        findOccarence(st,0,'a');
    }
}
