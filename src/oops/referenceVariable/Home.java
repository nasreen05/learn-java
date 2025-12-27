package oops.referenceVariable;
class Room1{
    String name;
    int id;
    void  Details(){
        System.out.println("Room Details------------------- ");
        System.out.println("name ="+name);
        System.out.println("id = "+id);

    }
}
public class Home {
    public static void main(String[] args) {
        Room1 r1=new Room1();
        r1.name="Neha Room";
        r1.id=101;
      //   r1.Details();


        Room1 r2=r1;
        r2.id=102;


         r1.Details();
        r2.Details();


    }

}
