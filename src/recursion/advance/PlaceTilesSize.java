package recursion.advance;

public class PlaceTilesSize {
    public static int printTiles(int n, int m){
        if(n==m){
            return 2;

        }
        if(n<m){
            return 1;
        }
        int  vertPlace= printTiles(n-m, m);
        int horePlace=printTiles(n-1,m);
        return  vertPlace+horePlace;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(printTiles(n,m));
    }
}
