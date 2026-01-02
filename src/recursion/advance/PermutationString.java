package recursion.advance;

public class PermutationString {
    public static void printPrem(String str , String premutation) {

     if(str.length()==0){
         System.out.println(premutation);
        return;
    }
        for(int i=0;i<str.length();i++){
         char cuu=str.charAt(i);
            String newStr=str.substring(0,i) +str.substring(i+1);
            printPrem(newStr,premutation+cuu);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        printPrem(str," ");
    }
}
