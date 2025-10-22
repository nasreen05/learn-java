package oops.arrayAdvance;

class MobileRunner {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[5];

        Mobile mobile1 = new Mobile();
        mobile1.setName("Samsung");
        mobile1.setMarketAdd("Bengaluru");

        Mobile mobile2 = new Mobile();
        mobile2.setName("Apple");
        mobile2.setMarketAdd("Delhi");

        Mobile mobile3 = new Mobile();
        mobile3.setName("OnePlus");
        mobile3.setMarketAdd("Mumbai");

        Mobile mobile4 = new Mobile();
        mobile4.setName("Nokia");
        mobile4.setMarketAdd("Chennai");

        Mobile mobile5 = new Mobile();
        mobile5.setName("Sony");
        mobile5.setMarketAdd("Hyderabad");

        for(int i = 0; i < mobiles.length; i++){
            if(i == 0){
                mobiles[i] = mobile1;
            } else if(i == 1){
                mobiles[i] = mobile2;
            } else if(i == 2){
                mobiles[i] = mobile3;
            } else if(i == 3){
                mobiles[i] = mobile4;
            } else if(i == 4){
                mobiles[i] = mobile5;
            }
        }

        for(int i = 0; i < mobiles.length; i++){
            Mobile mobile = mobiles[i];
            if(mobile != null){
                System.out.println("Mobile name");
                System.out.println(mobile.getName());
                System.out.println("Mobile MarketAddress");
                System.out.println(mobile.getMarketAdd());
                System.out.println();
            }
        }
    }
}