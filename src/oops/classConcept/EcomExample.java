package oops.classConcept;
class item{
    String itemName;
    int price;
int id;

void itemDetails(){
    System.out.println("itemName= "+itemName);
    System.out.println("price= "+price);
    System.out.println("id ="+ id);
}
}
class EcomExample {
    public static void main(String[] args) {
        item it1=new item();
           it1.itemName="Cold Drink";
           it1.price=200;
           it1.id=101;

           item it2=new item();
           it2.itemName="chocolate";
           it2.price=3000;
           it2.id=102;

           it1.itemDetails();
           it2.itemDetails();










    }
}
