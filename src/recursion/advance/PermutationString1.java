package recursion.advance;

public class PermutationString1 {
    public static void printPer(String str , String permutation){
       if(str.length()==0){
           System.out.println(permutation);
           return;
       }
       for(int i=0;i<str.length();i++){
           char curr=str.charAt(i);
           String newStr=str.substring(0,i)+str.substring(i+1);
           printPer(newStr,permutation+curr);
       }
    }

    public static void main(String[] args) {
        String str="abc";
        printPer(str," ");
    }
}
