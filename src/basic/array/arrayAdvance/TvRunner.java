package basic.array.arrayAdvance;

class TvRunner{
	public static void main(String[] args) {
		Tv[] tvs = new Tv[5];

		Tv tv1= new Tv();
		tv1.setName("Sony");
		tv1.setMarketAdd("Kolkata");

		Tv tv2= new Tv();
		tv2.setName("Panasonic");
		tv2.setMarketAdd("delhi");

		Tv tv3= new Tv();
		tv3.setName("Samsung");
		tv3.setMarketAdd("mumbai");

		Tv tv4= new Tv();
		tv4.setName("Lg");
		tv4.setMarketAdd("channai");

		Tv tv5= new Tv();
		tv5.setName("Tcl");
		tv5.setMarketAdd("Jaipur");

		for(int i=0; i<tvs.length;i++){
			if(i==0){
				tvs[i]=tv1;
			}else if(i==1){
				tvs[i]=tv2;
			}
			if(i==1){
				tvs[i]=tv2;
			}else if(i==2){
				tvs[i]=tv3;
			}else if(i==3){
				tvs[i]=tv4;
		    }else if(i==4){
			tvs[i]=tv5;

		
			}
			}
        for(int i=0;i<tvs.length;i++){
        	Tv tv=tvs[i];
        	if(tv !=null){
        		System.out.println("Tv name");
        		 System.out.println(tv.getName());
        		System.out.println("TV MarketAddress");
        		System.out.println(tv.getMarketAdd());
        		System.out.println();
        	}
        }
    }
}