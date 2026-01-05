package ClassTypeCasting;
class TV{

}
class  Samsung extends  TV {

}
class Sony  extends  TV{

}
public class TVRunner {
    public static void main(String[]args){

        TV tv=new Samsung();
        TV tv1=new Sony();

        System.out.println(tv instanceof Samsung);
        System.out.println(tv1 instanceof Sony);

        Samsung sumsung=(Samsung) tv;
        Sony sony=(Sony) tv1;




    }
}
