package SingletonDesignPattern;
class DBConnect{
    private DBConnect(){

    }
    private  static  DBConnect instance;
    public static  DBConnect getDBConnect(){
        if(instance==null){
            instance = new DBConnect();

        }
        return  instance;
    }
}
class SingleDp3{
public static void main(String[] args){

    DBConnect dbConnect= DBConnect.getDBConnect();
    DBConnect dbConnect1= DBConnect.getDBConnect();
    System.out.println(dbConnect.hashCode());

    System.out.println(dbConnect1.hashCode());
  }
}
