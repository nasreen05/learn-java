package SingletonDesignPattern;

class  DBConnnerction{

}
public class SingleDp {
    public static void main(String[] args){

        DBConnnerction dbConnnerction= new DBConnnerction();
        DBConnnerction dbConnnerction1=new DBConnnerction();
    System.out.println(dbConnnerction.hashCode());
    System.out.println(dbConnnerction1.hashCode());
    }
}

