package Interface_OPPs;

 class DellLaptop implements  Laptop {
        private int price;
        private String place;

        public DellLaptop(int price , String place){
            this.price=price;
            this.place=place;
            }
            @Override

     public void showDetails(){
            System.out.println("Dell-Laptop price"+price+"Dell-Laptop Place"+place);

        }


}



