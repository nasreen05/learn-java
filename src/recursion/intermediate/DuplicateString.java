package recursion.intermediate;

public class DuplicateString {
    public static boolean[] map = new boolean[26];
  public static void dupStr(String str, int idx, String newStr){
      if(idx==str.length()){
          System.out.println(newStr);
          return;
      }
      char curr=str.charAt(idx);
      if(map[curr-'a']){
          dupStr(str,idx+1,newStr);
      }else{
          newStr+=curr;
          map[curr-'a']=true;
          dupStr(str,idx+1,newStr);
      }

  }

    public static void main(String[] args) {
        String str="aabcddebbf";
        dupStr(str,0," ");
    }

}
