package recursion.advance;

public class PathsMove {
    public static int countP(int i,int j, int n , int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPath= countP(i+1,j,n,m);

        int rightPath=countP(i,j+1,n,m);
        return  downPath+rightPath;

    }

    public static void main(String[] args) {
        int n=3, m=5;
     int totalPath= countP(0,0 ,n ,m);
        System.out.println(totalPath);
    }
}
