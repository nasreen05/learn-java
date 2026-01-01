package recursion.intermediate;

public class EndString {
    public static void moveAll(String str, int idx, int count , String  newString){
        if(idx==str.length()){
           for(int i=0;i<count;i++){
               newString +='x';
           }
            System.out.println(newString);
            return;
        }
        char current = str.charAt(idx);
        if(current=='x'){
            count ++;
            moveAll(str, idx+1, count ,newString);
        }else{
            newString +=current;
            moveAll(str, idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
     String str = "axbcxxd";
     moveAll(str,0,0, "");
    }
}
