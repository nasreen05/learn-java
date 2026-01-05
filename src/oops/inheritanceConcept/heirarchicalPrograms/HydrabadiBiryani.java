package Heirarchical;

class HydrabadiBiryani extends Biryani {
 String riceType;
 public HydrabadiBiryani() {
 }

     public HydrabadiBiryani(String riceType, String name, int price){
         super(price,name);
         this.riceType=riceType;
      //   this.name=name;
        // this.price=price;

     }
     public void details(){
         System.out.println("Hyderabadi Biryani Details ");
         System.out.println("name --- "+name);
         System.out.println("price -- " + price );
         System.out.println("rice type -- " + riceType);


     }
 }


