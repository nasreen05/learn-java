package ClassTypeCasting;

class  Sweet{

}
class Champakali extends Sweet{

}
class Jilebi extends  Sweet{

}
public class SweetRunner {
    public  static void main(String[] args){

        Sweet sweet=new Jilebi();

        System.out.println(sweet instanceof Champakali);
        System.out.println(sweet instanceof Jilebi);

        //instanceOf
        Champakali  champakali= (Champakali) sweet;

        //sweet-jilebi, champakali
        //falls- jogFalls, AbbeFalls
        //Beverage-tea, coffe
        //laptop- Dell, lenovo


    }


}
