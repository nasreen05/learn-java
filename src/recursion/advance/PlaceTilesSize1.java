package recursion.advance;

public class PlaceTilesSize1 {
    public static  int printTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertiTiles=printTiles(n-m,m);
         int horizontal=printTiles(n-1,m);

         return  vertiTiles+horizontal;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(printTiles(n,m));
    }
}
