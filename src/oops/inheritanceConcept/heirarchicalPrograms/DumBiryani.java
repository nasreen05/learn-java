package Heirarchical;

public class DumBiryani  extends  Biryani {


        String place;

        public DumBiryani() {

        }

        public DumBiryani(String place, String name, int price) {
            super(price, name);

            // super() constructor chaining of parent class
            // this() - constructor chaining of same class

            this.place = place;
            // this.name = name;
            // this.price = price;
        }

        public void details() {
            System.out.println("Dum Biryani Details ");

            System.out.println("name --  " + name);
            System.out.println("price -- " + price );
            System.out.println("place -- " + place );
        }
    }

