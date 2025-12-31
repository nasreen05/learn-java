package oops.interfacePrograms;

class AsusLaptop implements Laptop{
        private int price;
        private String place;

    public AsusLaptop(int price , String place){
        this.price=price;
        this.place=place;
    }
    @Override

    public void showDetails(){
        System.out.println("Asus-Laptop price"+price+"Asus-Laptop Place"+place);

    }


}









