package oops.arrayAdvance;

class LaptopRunner{
	public static void main(String[] args) {
		Laptop[] laptops = new Laptop[5];

		Laptop laptop1= new Laptop();
		laptop1.setName("Asus");
		laptop1.setMarketAdd("Kolkata");

		Laptop laptop2= new Laptop();
		laptop2.setName("hp");
		laptop2.setMarketAdd("delhi");

		Laptop laptop3= new Laptop();
		laptop3.setName("dell");
		laptop3.setMarketAdd("mumbai");

		Laptop laptop4= new Laptop();
		laptop4.setName("mac");
		laptop4.setMarketAdd("channai");

		Laptop laptop5= new Laptop();
		laptop5.setName("lenovo");
		laptop5.setMarketAdd("Jaipur");

		for(int i=0; i<laptops.length;i++){
			if(i==0){
				laptops[i]=laptop1;
			}else if(i==1){
				laptops[i]=laptop2;
			}
			if(i==1){
				laptops[i]=laptop2;
			}else if(i==2){
				laptops[i]=laptop3;
			}else if(i==3){
				laptops[i]=laptop4;
		    }else if(i==4){
			laptops[i]=laptop5;

		
			}
			}
        for(int i=0;i<laptops.length;i++){
        	Laptop laptop=laptops[i];
        	if(laptop !=null){
        		System.out.println("Laptop name");
        		 System.out.println(laptop.getName());
        		System.out.println("laptop MarketAddress");
        		System.out.println(laptop.getMarketAdd());
        		System.out.println();
        	}
        }
    }
}