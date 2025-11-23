package basic.asciiConcept;

public class CharCount {
    public static void main(String[] args){
        String name="ababac";
        int[]arr=new int[256];
        char[] carr=name.toCharArray();
        for(int i=0;i<carr.length;i++){
            arr[carr[i]]++;
            //arr[97], arr[98]++
            }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
        System.out.println((char)i +" occurs : " +arr[i]);
            }
        }
    }
}
