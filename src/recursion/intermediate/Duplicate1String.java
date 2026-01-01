package recursion.intermediate;

public class Duplicate1String {
    public static  boolean[] map=new boolean[26];

    public static void dupremove(String str , int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']){
            dupremove(str, idx+1,newStr);
        }else{
            newStr+=curr;
            map[curr-'a']=true;
            dupremove(str, idx+1,newStr);
        }
    }

    public static void main(String[] args) {
        String str="abbacdccddefeghhg";
        dupremove(str,0 , "");
    }
}
