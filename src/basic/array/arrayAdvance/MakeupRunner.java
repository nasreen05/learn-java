package basic.array.arrayAdvance;

class MakeupRunner{
	
    public static void main(String[] args) {
        Makeup[] makeups = new Makeup[5];

        Makeup makeup1 = new Makeup();
        makeup1.setName("Eyeliner");
        makeup1.setCompanyName("Lakme");

        Makeup makeup2 = new Makeup();
        makeup2.setName("Lipstick");
        makeup2.setCompanyName("Dior");

        Makeup makeup3 = new Makeup();
        makeup3.setName("Foundation");
        makeup3.setCompanyName("Chanel");

        Makeup makeup4 = new Makeup();
        makeup4.setName("Highlighter");
        makeup4.setCompanyName("Mama Earth");

        Makeup makeup5 = new Makeup();
        makeup5.setName("Eyelashes");
        makeup5.setCompanyName("Sugar Cosmetics");

       for(int i=0; i<makeups.length;i++){
			if(i==0){
				makeups[i]=makeup1;
			}else if(i==1){
				makeups[i]=makeup2;
			}
			if(i==1){
				makeups[i]=makeup2;
			}else if(i==2){
				makeups[i]=makeup3;
			}else if(i==3){
				makeups[i]=makeup4;
		    }else if(i==4){
			makeups[i]=makeup5;

		
			}
			}

        
        for (int i = 0; i < makeups.length; i++) {
            Makeup makeup = makeups[i];
            System.out.println("Makeup product name:");
            System.out.println(makeup.getName());
            System.out.println("Company name:");
            System.out.println(makeup.getCompanyName());
            System.out.println();
        }
    }
}
