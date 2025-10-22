package SingletonDesignPattern;

class DBConnection{
private  DBConnection(){
}
public static DBConnection getDBConnection(){
    return new DBConnection();
}
}
class SingleDp1{
public static void main(String[] args){
    DBConnection dbConnection= DBConnection.getDBConnection();
    DBConnection dbConnection1= dbConnection.getDBConnection();
    System.out.println(dbConnection.hashCode());
    System.out.println(dbConnection1.hashCode());
}

}