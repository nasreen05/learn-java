package oops.thisKeywordConcept;
class Item{
    String name;//data member or global member
    int price;
    Item(String name, int price){ // parameters are always consider as local veriable
        this.name=name;
       this.price=price;
    }
    void details(){
        System.out.println("Item name :"+name);
        System.out.println("Item price :"+ price);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
     Item i1=new Item("iphone",15000);
     i1.details();
    }
}
