package basic.array.arrayAdvance;

class PatternStar{
	public static void main(String[] args) {


/*	
------------------------------->
		int row=5;
		int star=1;
		int spc=5;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print("");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }
    System.out.println();
    star++;
    spc--;


	 }
	}
}


*
**
***
****
*****



  ---------------------------->
       int row=5;
		int star=9;
		int spc=1;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("* ");
    }
    System.out.println();
    star-=2;
    spc+=2;


	 }
	}
}


 *********
  *******
   *****
    ***
     *

     

---------------------------------->

       int row=5;
		int star=1;
		int spc=9;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("* ");
    }
    System.out.println();
    star+=2;
    spc-=2;


	 }
	}
}


       *
      ***
     *****
    *******
   ********* 



--------------------------------->
		int row=5;
		int star=1;
		int spc=4;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }
    System.out.println();
    star+=2;
    spc--;

	 }
        int row1=4;
		int star1=7;
		int spc1=1;

	for(int r=1;r<=row1;r++){
	for(int s=1;s<=spc1;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star1;i++){
    	System.out.print("*");
    }
    System.out.println();
    star1-=2;
    spc1++;
}

	}
}



       *
      ***
     *****
    *******
   *********
   *********
    *******
     *****
      ***
       *

       
------------------------------------>

	    int row=9;
		int star=1;
		int spc=4;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }

    System.out.println();
    if(r<=row/2){
    	star+=2;
    	spc--;
    }else{
    	star-=2;
    	spc++;
    }
}
}
    }

       *
      ***
     *****
    *******
   *********
   *********
    *******
     *****
      ***
       *
     

---------------------------------->
		 int row=9;
		int star=1;
		int spc=4;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print("");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }

    System.out.println();
    if(r<=row/2){
    	star++;
    	spc--;
    }else{
    	star--;
    	spc++;
    }
}
}
    }

*
**
***
****
*****
****
***
**
*

----------------------------------->

       int row=9;
		int star=5;
		int spc=1;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print("");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }

    System.out.println();
    if(r<=row/2){
    	star--;
    	spc++;
    }else{
    	star++;
    	spc--;
    }
}
}
    }	

*****
****
***
**
*
**
***
****
*****	



---------------------------------------->
  int row=9;
		int star=1;
		int spc=4;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }

    System.out.println();
    if(r<=row/2){
    	star++;
    	spc--;
    }else{
    	star--;
    	spc++;
    }
}
}
    }
          *
	     **
	    ***
	   ****
	  *****
       ****
        ***
         **
          *

          

-------------------------------------->
	 int row=9;
		int star=5;
		int spc=1;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("*");
    }

    System.out.println();
    if(r<=row/2){
    	star--;
    	spc++;
    }else{
    	star++;
    	spc--;
    }
}
}
    }	

    *****
     ****
      ***
       **
        *
       **
      ***
     ****
    *****


 -------------------------------->

 int row=9;
		int star=5;
		int spc=1;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("* ");
    }

    System.out.println();
    if(r<=row/2){
    	star--;
    	spc++;
    }else{
    	star++;
    	spc--;
    }
}
}
    }	

    * * * * *
     * * * *
      * * *
       * *
        *
       * *
      * * *
     * * * *
    * * * * *  


 
	--------------------------------->

        int row=5;
		int star=1;
		int spc=0;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("* * * * *");
    }

    System.out.println();
    spc++;
}
   } 
 }

 *****
  *****
   *****
    *****
     *****

     
     ---------------------------------------->

  int row=5;
		int star=1;
		int spc=5;

	for(int r=1;r<=row;r++){
	for(int s=1;s<=spc;s++){
	 		System.out.print(" ");
	 	}
	
    for(int i=1;i<=star;i++){
    	System.out.print("* * * * *");
    }

    System.out.println();
    spc--;
}
   } 
 }

          *****
         *****
        *****
       *****
      *****
	

	*/

	int row=5;
		int star=1;
		int spc=4;

		for(int r=1; r<=row;r++){
			for(int s=1; s<=spc; s++){
				System.out.print("");
			}
			for(int i=1;i<=star;i++){
				System.out.print("*");
			}
				System.out.println();
				star++;
				spc--;
				

			
		}
	}
}	