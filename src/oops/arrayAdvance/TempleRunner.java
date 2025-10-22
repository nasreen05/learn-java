package oops.arrayAdvance;

class TempleRunner{
    public static void main(String[] args) {
        Temple[] temples = new Temple[5]; 

        Temple temple1 = new Temple();
        temple1.setName("Circle maramma");
        temple1.setAddress("Malaeshwar");

        //temples[1] = temple2;
        //temple[2]= temple3;
        //temple[3]=temple4;
        //temple[4]=temple5;

        Temple temple2 = new Temple();
        temple2.setName(" maramma");
        temple2.setAddress("Channai");

        Temple temple3= new Temple();
		temple3.setName("RAM ");
		temple3.setAddress("Delhi");
		
		Temple temple4= new Temple();
		temple4.setName("Rahim");
		temple4.setAddress("Mumbai");
		
		Temple temple5= new Temple();
		temple5.setName("Iscon ");
		temple5.setAddress("Kolkata");
		
		

        for (int i = 0; i < temples.length; i++) {
            if (i == 0) {
                temples[i] = temple1;
            } else if (i == 1) {
                temples[i] = temple2;
            }
			if(i==1){
			temples[i]=temple2;
			}else if(i==2){
			temples[i]= temple3;
		    }else if(i==3){
			temples[i]=temple4;
			}else if(i==4){
			temples[i]=temple5;
		}
		}
			

        for (int i = 0; i < temples.length; i++) {
            Temple temple = temples[i];
            if (temple != null) {
                System.out.println(temple.getName());
                System.out.println(temple.getAddress());
            }
        }


        // if (temples[i] != null) {
        //     System.out.println("Temple name" + temples[i].getName());
        //     System.out.println("Temple address" + temples[i].getAddress());
        // }
    }
	}


