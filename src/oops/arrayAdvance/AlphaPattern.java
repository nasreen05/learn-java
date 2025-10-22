package oops.arrayAdvance;

class AlphaPattern{
	public static void main(String[] args) {
	
    /*    int row = 6; 

        for (int r = 1; r <= row; r++) {
            char ch = 'A'; 
            for (int s = 1; s <= r; s++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

A
A B
A B C
A B C D
A B C D E
A B C D E F
	
----------------------------------------------------->

	int row=5;
		int star=1;
		char ch='A';

		for(int r=1;r<=row;r++){			
			for(int s=1;s<=star;s++){
				System.out.print(ch+" ");
				
			}
			System.out.println();
			star++;
			ch++;

		}
	}
}


A
B B
C C C
D D D D
E E E E E

------------------------------------------------------------>
int  row=11;
int star=1;
for(int r=1;r<=row;r++){

	char ch='A';
	for(int s=1;s<=star;s++){
	System.out.print(ch+" ");
	ch++;
}
System.out.println();
if(r<=row/2){
	star++;
}else{
	star--;

      }
   }

  }
}
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E
A B C D
A B C
A B
A

------------------------------------------------------------>

	int row=12;
	int star= 6;
	for( int r=1;r<=row;r++){

	char ch='A';
	for(int s=1;s<=star;s++){
		System.out.print(ch+" ");
		ch++;
	}
	System.out.println();
	if(r<row/2){
		star--;
	}else{
		star++;
	}
	   }
			}
			  }
A B C D E F
A B C D E
A B C D
A B C
A B
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G

-------------------------------------------------->
	      int row=6;
		int star=6;

		for(int r=1;r<=row;r++){

			char ch ='F';
			for(int s=1;s<=star;s++){
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
			star--;
		}
	}
}
 F E D C B A
F E D C B
F E D C
F E D
F E
F

---------------------------------------------------------->
	   int row=6;
		int star=6;

		for(int r=1;r<=row;r++){

			char ch ='A';
			for(int s=1;s<=star;s++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			star--;
		}
	}
}

A B C D E F
A B C D E
A B C D
A B C
A B
A

--------------------------------------------------------->
		int row =6;
		int star=1;
		char ch='A';

		for(int r=1;r<=row;r++){
	     for(int s=1;s<=star;s++){
	     	System.out.print(ch+" ");
	     	ch++;
	     }
	    System.out.println();
	    star++;
	 }
  }

}

A
B C
D E F
G H I J
K L M N O
P Q R S T U

----------------------------------------------->
     
        int row=6;
		int star=1;

		for(int r=1;r<=row;r++){

			char ch ='F';
			for(int s=1;s<=star;s++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			star++;
		}
	}
}      

F
F G
F G H
F G H I
F G H I J
F G H I J K
*/

		

        int row = 6; 

        for (int r = 1; r <= row; r++) {
           
            for (int space = 1; space <= row - r; space++) {
                System.out.print(" ");
            }
            
            
            char ch = 'A';
            for (int s = 1; s <= r; s++) {
                System.out.print(ch + " ");
                ch++;
            }
            
            System.out.println();
        }
    }
}
        

     
