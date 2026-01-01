package recursion.intermediate;

public class SubsequenceString {
    public static  void subSequence(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char current =str.charAt(idx);

        subSequence(str, idx+1, newStr+current);

        subSequence(str, idx+1,newStr);
    }

    public static void main(String[] args) {
        String str="abcd";
        subSequence(str, 0," ");
    }
}
