package recursion.intermediate;

public class TowerOfHanoi {
    public static void towerHanoi(int n, String src, String helper, String destin) {
    if(n==1){
        System.out.println("transfer dish" + n + " from " + src + " to " + destin );
        return;
    }
    towerHanoi(n-1, src,destin,helper);
        System.out.println("transfer dish" + n + " from " + src + " to " + destin);
       towerHanoi(n-1, helper ,src,destin);
    }

    public static void main(String[] args) {
        int n=3;
        towerHanoi( n," S "," H "," D ");

    }
}
