package recursion.intermediate;

public class EndString1 {

    public  static void  moveX(String str ,int idx , int count, String newStr) {

        if (idx == str.length()) {
            for(int i=0;i<count ;i++){
                newStr +='x';
            }
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(idx);
        if (current == 'x') {
            count++;
            moveX(str, idx+1, count, newStr);
        } else {        //newStr= newStr+current
            newStr += current;
            moveX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
    String str= "axxbcxxd";
    moveX(str,0,0," ");
    }
}
