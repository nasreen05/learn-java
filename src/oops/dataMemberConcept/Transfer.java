package oops.dataMemberConcept;
class User {
    //data member role is we can hold or store the data
    //data common for all the object we should go for static
    static String appName;
    //data is different for each object we should go for non static /instance
    String name;
    long phone;
    //function member we can use the data member  to operator


    void itTransfer(){
        System.out.println("wel" + User.appName);
        System.out.println(name + "app" + phone);
    }
}
class Transfer{
    public static void main(String[] args) {
        User.appName="OPP";
        User u=new User();
        u.name="neha";
        u.phone=9887;
        u.itTransfer();

        User u1=new User();
        u1.name="Priyaa";
        u1.phone=8989;
         u1.itTransfer();

    }

}
