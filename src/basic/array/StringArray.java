package basic.array;

public class StringArray {
    public static void main(String[] args){
        String name="azam";
    System.out.println(name);
    char[] carr= name.toCharArray();
    for(int i=0;i<carr.length;i++){
      System.out.println(carr[i]);
    }
    String fullName="Azam Amir Reza";
    String[] sname=fullName.split(" ");
    for(int i=0;i<sname.length;i++){
        char[] scarr = sname[i].toCharArray();
        for(int j=0;j<scarr.length;j++){
      System.out.println(scarr[j]);
    }
 /*   char[] scarr = sname[1].toCharArray();
    for(int i=0;i<scarr.length;i++){
      System.out.println(scarr[i]); */
    }
  }
}
