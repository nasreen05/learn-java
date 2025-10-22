package Mobile;


 class Android  extends  Mobile{

        private String  androidVersion;

        public Android(String brand, double price , String androidVersion) {
            super(brand,price);
            this.androidVersion = androidVersion;
        }
        public Android(){

    }

     public String getAndroidVersion() {
         return androidVersion;
     }

     public void setAndroidVersion(String androidVersion) {
         this.androidVersion = androidVersion;
     }

}

