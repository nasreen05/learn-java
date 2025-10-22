package SingletonDesignPattern;

class  DBConnection1{
    private DBConnection1(){

    }
    private static  DBConnection1  instance;
    public static  DBConnection1 getDBConnection(){
        if(instance ==null){
            instance= new DBConnection1();
        }
return  instance;
    }
}
public class SingleDp2 {
    public static void main(String[] args){
DBConnection1 dbConnection1= DBConnection1.getDBConnection();
DBConnection1 dbConnection2= DBConnection1.getDBConnection();
    System.out.println(dbConnection1.hashCode());
    System.out.println(dbConnection2.hashCode());
    }
}
