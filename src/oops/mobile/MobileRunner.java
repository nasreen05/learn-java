package Mobile;

 class MobileRunner {

 public static void main(String[] args) {


     Android androidPhone = new Android();
     androidPhone.setBrand("Samsung");
     androidPhone.setPrice(80000);
     androidPhone.setAndroidVersion("Android 13");

     System.out.println("----Android Details-----");
     System.out.println("Brand Name: " + androidPhone.getBrand());
     System.out.println("Price: " + androidPhone.getPrice());
     System.out.println("AndroidVersion : " + androidPhone.getAndroidVersion());


     Ios iosPhone = new Ios();
     iosPhone.setBrand("Apple");
     iosPhone.setPrice(180000);
     iosPhone.setIosVersion("i  13");

     System.out.println("----Ios Details-----");
     System.out.println("Brand Name: " + iosPhone.getBrand());
     System.out.println("Price: " + iosPhone.getPrice());
     System.out.println("IosVersion : " + iosPhone.getIosVersion());
        }
    }



