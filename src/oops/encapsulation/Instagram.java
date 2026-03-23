package oops.encapsulation;

public class Instagram {
   public String userName;
   private String password;
   private  long mobNo;
   private String email;

   public Instagram(String userName, String password, long mobNo, String email){
   this.userName=userName;
   this.password=password;
   this.mobNo=mobNo;
   this.email=email;

   }
   public String getPassword(){

       return password;
   }
   public  String getEmail(){

       return  email;
   }
   public  long getMobNo(){

       return  mobNo;
   }
   public  void setPassword(String password){
       this.password=password;

   }
   public  void  setEmail(String  email)
   {
       this.email=email;
   }
   public  void  setMobNo(long mobNo){

       this.mobNo=mobNo;
   }
}
